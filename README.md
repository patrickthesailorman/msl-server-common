# MSL Server Common

This repository is a sub-repository of the [Kenzan Million Song Library](https://github.com/kenzanmedia/million-song-library) (MSL) project, a microservices-based Web application built using [AngularJS](https://angularjs.org/), a [Cassandra](http://cassandra.apache.org/) NoSQL database, and [Netflix OSS](http://netflix.github.io/) tools.

> **NOTE:** For an overview of the Million Song Library microservices architecture, as well as step-by-step instructions for running the MSL demonstration, see the [Million Song Library Project Documentation](https://github.com/kenzanmedia/million-song-library/tree/develop/docs).

## Overview

You can run build all of the MSL microservices by running `mvn clean compile` from the `server` directory of the main [million-song-library](https://github.com/kenzanmedia/million-song-library/tree/develop/server) repository.

The **msl-server-common** sub-repository contains classes that are used by multiple microservices, including models and DTOs. There is no need to build **msl-server-common** separately.

 ## LICENSE
Copyright 2015 Kenzan, LLC <http://kenzan.com>
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.