setup:
	./gradlew clean install

run-dist:
	@chcp 65001 > nul
	@.\build\install\app\bin\app
