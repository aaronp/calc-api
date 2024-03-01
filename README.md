# Contract-First Example

This project was created as an example of a 'contract-first' approach to developing REST services.

The idea is that there is a repository (This repository) which simply contains:

* the OpenAPI contract in [v1/service.yaml](./v1/service.yaml)

Providers and consumers of this API contract can be added to this repo and participate in the evolution of the API.

## Versioning
This library follows semantic versioning in its repository tags.

New major versions (e.g. version incompatible changes) are created by adding new services under the `v1`, `v2`, `v3` subdirectories in this repository.

This way existing implementations and clients will be unaffected by targeting the appropriate major version directory of the main branch. 

## Related Projects

This section maintains a list of projects which either implement or consume this API.

If you do not see your project here, please open a pull-request to [this README.md](./README.md) to have your project added.

### Implementations

 * [calc-api-service](https://github.com/aaronp/calc-api-service)

## Stubs
For convenience, this repository publishes common stubs for the service and client implementations.

Or at least, that would be the intent. In this example, we actually just checked in the result of running an openapi-generator into the [server-generated/v1](./server-generated/v1).

Also, instead of going to the effort of publishing to e.g. maven central, we "fake it" but just publishing locally by running:
```bash
./build.sh
```

Once published locally, the server implementation project (e.g. [calc-api-service](https://github.com/aaronp/calc-api-service)) can be built

## Building

Clients or server implementations of this API will choose to use generate stubs based on the service definitions by using the URL of the appropriate service.

For example, using the 
```shell
openapi-generator-cli generate \
  -i https://raw.githubusercontent.com/aaronp/calc-api/main/v1/service.yaml \
  -g scala-cask \
  -o path/to/output_dir
```

Or as a zero-install dockerised version:
```bash
docker run --rm \
    -v ${PWD}:/local openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/aaronp/calc-api/main/v1/service.yaml \
    -g scala-cask \
    -o /local/path/to/output_dir
```

To list other options (e.g. beyond `-g spring`), use this:
```bash
docker run --rm openapitools/openapi-generator-cli list
```