# CVE-2025-24813: Apache Tomcat RCE Proof of Concept

This repository provides a controlled, automated environment to demonstrate
Remote Code Execution (RCE) vulnerabilities in Apache Tomcat via
CVE-2025-24813.

## Overview
This PoC exploits misconfigured file-based session persistence in Apache
Tomcat's `DefaultServlet` to achieve unauthorized file overwrites.

## How to Use This Repo
### Prerequisites
- Docker and Docker Compose installed.

### 1. Launch the Environment
From the repository root, run:
```bash
docker compose up -d --build
```

### 2. Run the Exploit
Follow the automated tutorial workflow:
1. Navigate to the `exploit/` directory.
2. Activate the python virtual environment:
    ```bash
    source venv/bin/activate
    ```
3. Follow the instructions in `./exploit/exploit_path.md` to execute the exploit.
