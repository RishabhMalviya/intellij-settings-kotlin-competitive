# IntelliJ Settings Configurations for Competitive Programming with Kotlin!
Each `.zip` file contains a settings configuration that you can import into IntelliJ IDEA. These settings configurations aim to make it easier for you to write, test and submit Kotlin code to Competitive Programming contests on various websites. 

## How to Import the Settings
1. Clone the repository, so that all the `.zip` files are readily available on your system. 

2. **Make sure to save your existing settings using `File` -> `Export Settings` before proceeding.** The next step will overwrite any existing customizations you may have done in your IDE. 

3. Before starting a contest, go to `File` -> `Import Settings`, and select the `kotlin-cp.zip` to import the relevant settings. For LeetCode, import `kotlin-leetcode.zip` instead. And that's it!

4. When you're done and you want to bring back your original environment, re-import your original settings from the file you generated in step 2.

## How to Use the Settings
1. Create a new project for every contest.

2. Create a new file for each problem. Click on the `src` folder and press `alt + N` to create a new file based on the template.
The template contains all common functions for parsing input and writing to stdout, as well as a basic class structure; the places
where you need to fill in your code ar marked with `// TODO...`.

3. If you want to run the Kotlin REPL, press `alt + K`.

4. If you want to run your code with input from standard input, press `Ctrl + Shift + F10`.

5. If you want to debug your code, press `Shift + F9`.
