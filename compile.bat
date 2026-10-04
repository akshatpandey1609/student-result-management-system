@echo off
setlocal
cd /d "%~dp0"

echo.
echo ==============================
echo    Compiling Student Project
echo ==============================
echo.

if not exist bin mkdir bin

javac -d bin src\com\bytecode\main\MainApp.java src\com\bytecode\main\bo\StudentBO.java src\com\bytecode\main\db\DB.java src\com\bytecode\main\entity\Student.java src\com\bytecode\main\service\StudentService.java src\com\bytecode\main\service\impl\StudentServiceImpl.java

if errorlevel 1 (
    echo.
    echo ==============================
    echo       COMPILE FAILED
    echo ==============================
    exit /b 1
) else (
    echo.
    echo ==============================
    echo     COMPILE SUCCESSFUL
    echo ==============================
)
endlocal
pause
