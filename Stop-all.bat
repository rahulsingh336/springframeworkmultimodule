FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :9411') DO TaskKill.exe /PID %%P
FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :9401') DO TaskKill.exe /PID %%P
FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :9402') DO TaskKill.exe /PID %%P
FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :9403') DO TaskKill.exe /PID %%P
FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :8080') DO TaskKill.exe /PID %%P
FOR /F "tokens=5 delims= " %%P IN ('netstat -a -n -o ^| findstr :8881') DO TaskKill.exe /PID %%P