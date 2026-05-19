# CVE-2025-24813 PoC Implementation Specifications

## Overview
This project provides a controlled, automated environment to demonstrate Remote
Code Execution (RCE) via CVE-2025-24813 in Apache Tomcat 10.1.0.

## Architecture
- **Containerization**: Docker Compose for easy orchestration.
- **Target Image**: `tomcat:10.1.0` (official).
- **Vulnerable Configuration**:
    - `web.xml` modified to set the `DefaultServlet` parameter `readonly` to `false`, enabling `PUT` and `DELETE` methods.
    - Session management configured to use file-based persistence in the default storage location, allowing the overwriting of session files via the vulnerable servlet.

## Prerequisites for RCE
- **Gadget Chain**: To achieve RCE, the target application *must* include a library on its classpath that supports gadget-based deserialization (e.g., Apache Commons Collections).
- **Vulnerable Application**: A dummy web application will be deployed to the Tomcat container, which includes this vulnerable library in `WEB-INF/lib`.

## Project Structure
1.  `docker-compose.yml`: Defines the target service and network.
2.  `Dockerfile`: Customizes the base `tomcat:10.1.0` image with necessary configuration files.
5.  `webserver/`: Dummy application source.
6.  `exploit/`: Contains the Python payload generation script (`generate_payload.py`) and a tutorial script (`run_exploit.sh`).

## Setup (Automated)
- Run `docker-compose up -d --build` to launch the environment.

## Exploit Flow
1.  **Vulnerability Setup**: Verify that the `DefaultServlet` accepts `PUT` requests.
2.  **Payload Generation**: Use the provided script to generate a malicious serialized object., using a common gadget chain like Commons Collections).
3.  **Exploit Execution**: Use the `PUT` method to overwrite a session or add a file to be read as a session in the default storage directory with the malicious payload.
4.  **Trigger**: Trigger a request that forces Tomcat to deserialize the session, achieving RCE.
