# Loan Calculator APK (Staff & NGO Loan Calculator By Gemechu Iticha)

This project builds an Android APK automatically on GitHub. No Android Studio needed.

## Steps
1. Create a free account at github.com and sign in.
2. Click "+" (top right) > "New repository". Name it `loan-calculator`, keep it Private, click "Create repository".
3. Click "uploading an existing file". Unzip this project on your computer, then drag ALL its files and folders into the page
   (including the hidden `.github` folder). Click "Commit changes".
   - If `.github` does not upload: click "Add file" > "Create new file", type the name `.github/workflows/build-apk.yml`,
     paste the contents of that file from this project, and commit.
4. Open the "Actions" tab. The "Build Android APK" job starts by itself (takes about 5-8 minutes). Wait for the green tick.
   If it did not start: Actions > "Build Android APK" > "Run workflow".
5. Click the finished run, scroll to "Artifacts", download "Loan-Calculator-APK", unzip it to get `app-debug.apk`.
6. Send the APK to your phone, tap it, and allow "Install unknown apps" when Android asks.

## Updating the calculator later
Replace `www/index.html` in the repository with the new version and commit. A new APK builds automatically.
