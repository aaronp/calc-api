#!/usr/bin/env bash
pushd ./server-generated/v1
sbt publishLocal
popd