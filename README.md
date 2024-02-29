# Contract-First Example

This project was created as an example of a 'contract-first' approach to developing REST services.

The idea is that there is a repository (This repository) which simply containts:

* the OpenAPI contract in [service.yaml](./service.yaml)
* basic convenience build steps which can
    * perform basic validation that the service syntax is valid
    * build stub artefacts for other services to consume
 * the governance for evolving the contract

Providers and consumers of this API contract can be added to this repo and participate in the evolution of the API.

## Verioning
This library would follow semantic versioning in its repository tags.

New major versions (e.g. version incompatible changes) will be created by adding new services under the `v1`, `v2`, `v3` subdirectories in this repository.

## Related Projects

This section maintains a list of projects which either implement or consume this API.

If you do not see your project here, please open a pull-request to [this README.md](./README.md) to have your project added.

### Implementations

 * [calc-api-service](https://github.com/aaronp/calc-api-service)

## Building

Clients or server implementations of this API will choose to use generate stubs based on the service definitions by using the URL of the appropriate service.

For example, using the 
```shell
openapi-generator-cli generate \
  -i https://raw.githubusercontent.com/aaronp/calc-api/main/v1/service.yaml \
  -g spring \
  -o path/to/output_dir
```

Or as a zero-install dockerised version:
```bash
docker run --rm \
    -v ${PWD}:/local openapitools/openapi-generator-cli generate \
    -i https://raw.githubusercontent.com/aaronp/calc-api/main/v1/service.yaml \
    -g spring \
    -o /local/path/to/output_dir
```
