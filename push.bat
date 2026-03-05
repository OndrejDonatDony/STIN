@echo off
echo =========================
echo PUSH TO GITHUB
echo =========================

git add .
git commit -m "update"
git push origin main

echo.
echo Done.
pause