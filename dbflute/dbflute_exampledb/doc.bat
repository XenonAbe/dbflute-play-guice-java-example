@echo off

setlocal
%~d0
cd %~p0
call _project.bat

echo /nnnnnnnnnnnnnnnnnnnnnnnnnnn
echo ...Calling the Document task
echo nnnnnnnnnn/
call %DBFLUTE_HOME%\etc\cmd\_df-doc.cmd %MY_PROPERTIES_PATH%

if "%pause_at_end%"=="y" (
  pause
)
