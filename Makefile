setup:
	mkdir -p code/app
	cp gradlew* code/app/ 2>/dev/null || true
	cp -r gradle code/app/ 2>/dev/null || true
	cp build.gradle.kts code/app/ 2>/dev/null || true
	cp settings.gradle.kts code/app/ 2>/dev/null || true
	cp -r src code/app/ 2>/dev/null || true
	cp -r config code/app/ 2>/dev/null || true
	cd code/app && chmod +x gradlew && ./gradlew clean install

run-dist:
	@chcp 65001 > nul
	@if not exist "build\install\app\bin\app.bat" (.\gradlew.bat clean install)
	@.\build\install\app\bin\app.bat
