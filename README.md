# Contract-First Example

This project was created as an example of a 'contract-first' approach to developing REST services.

The idea is that there is a repository (This repository) which simply containts:

* the OpenAPI contract in [service.yaml](./service.yaml)
* basic convenience build steps which can
    * perform basic validation that the service syntax is valid
    * build stub artefacts for other services to consume
 * the governance for evolving the contract

Providers and consumers of this API contract can be added to this repo and participate in the evolution of the API.

## Building

