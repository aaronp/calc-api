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

## Building

Clients or server implementations of this API will choose to use generate stubs based on the service definitions by using the URL of the appropriate service.

For example, using the 
```shell
openapi-generator-cli generate -i [URL_OF_YOUR_SWAGGER_SPEC] -g spring -o service_output_dir

```

Or as a zero-install dockerised version:
```bash
docker run --rm -v ${PWD}:/local openapitools/openapi-generator-cli generate \
    -i /local/path_to_your_openapi.yaml \
    -g spring \
    -o service_output_dir

```
