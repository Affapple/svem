# Tasks

- [x] Create project structure
- [x] Write `IMPLEMENTATION.MD`
- [x] Create `Dockerfile` for Tomcat 10.1.0 with vulnerable configuration
- [x] Create `docker-compose.yml`
- [x] Configure `conf/web.xml` for `readonly=false` and file-based session persistence
- [x] Create vulnerable web app structure with gadget chain library
- [x] Develop `exploit/generate_payload.py` (gadget chain)
- [x] Fix `SESSIONS.ser` location. 
      **Result**: Identified `SESSIONS.ser` location at `/usr/local/tomcat/work/Catalina/localhost/ROOT/SESSIONS.ser`.
- [ ] **Task**: Develop `exploit/run_exploit.sh`.
      **Why**: Need an automated way to execute the attack chain (Put payload -> Trigger deserialization).
      **Action**: Write script using `curl` and payload.
- [ ] **Task**: Verify RCE.
      **Why**: Validate PoC works as expected.
      **Action**: Run exploit and check for created file in container.
- [ ] **Task**: Source and place 'commons-collections-3.1.jar' in 'webapp/WEB-INF/lib/'
- [ ] **Task**: Develop verification script for 'DefaultServlet' PUT capability
- [ ] **Task**: Update 'exploit/run_exploit.sh' to target correct persistence path and validate execution
- [ ] **Task**: Verify RCE functionality
