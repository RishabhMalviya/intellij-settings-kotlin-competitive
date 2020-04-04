# IntelliJ Settings Configurations for Competitive Programming with Kotlin!
Each folder contains a settings configuration that you can zip and import into IntelliJ IDEA. These settings configurations aim to make it easier for you to write, test and submit Kotlin code to Competitive Programming contests on various websites. 

**NOTE**: **I strongly advise you to save you existing settings using `File` -> `Export Settings` before using any of these.** Importing these settings will overwrite any existing settings customizations you may have done in your IDE. 

## How to Import the Settings
Clone the repository, so that all the folders are readily available on your system. 

As you may have noticed, there is a different folder for each website. So, if you are going to participate in a contest on CodeChef, for example, you would go zip the folder `kotlin-codechef`, then go to `File` -> `Import Settings` in IntelliJ to import the `.zip` file. That's it!

When you want to start a contest on another website, zip and import the relevant folder before starting.

When you're done and you want to bring back your original environment, import the file that you generated when you first exported your existing settings *as was advised at the beginning of the README*.

## How to Use the New Setting in your Local IDE
**TODO**: Since the exact design - the UX, so to speak - for each website is different, I will explain how to use these settings on each website in a separate article, to which I will put a link here very soon.

## Merging With Existing Settings
Supposedly, IntelliJ makes it possible to merge (as opposed to overwrite) existing settings with external settings as part of the [Settings Repositories](https://www.jetbrains.com/help/idea/sharing-your-ide-settings.html#settings-repository) feature, but I have not been able to reproduce my settings correctly using this method. You may want to give it a shot with a fork of [this repository](https://github.com/RishabhMalviya/intellij-settings-kotlin-codechef.git).
