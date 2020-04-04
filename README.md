# intellij-settings-kotlin-competitive
Each `.zip` file contains a settings configuration that you can import into IntelliJ IDEA. These settings configurations aim to make it easier for you to write, test and submit Kotlin code to Competitive Programming contests on various websites. 

**NOTE**: Importing these settings will overwrite any existing settings customizations you may have done in your IDE. **I strongly advise you to save you existing settings using `File` -> `Export Settings` before using any of these.** 

## How to Import the Settings
Clone the repository, so that all the `.zip` files are readily available on your system. 

Now, as you may have noticed, there is a different settings file for each website. So, if you are going to participate in a contest on CodeChef, for example, you would go to `File` -> `Import Settings`, and then select the `kotlin-codechef.zip` file to import the settings. And that's it!

## How to Use the New Setting in your Local IDE
**TODO**: Since the exact design - the UX, so to speak - for each websites' settings configuration is different, I will explain how to use your newly configured IDE in a separate article, to which I will put a link here very soon.

## Merging With Existing Settings
Supposedly, IntelliJ makes it possible to merge (as opposed to overwrite) existing settings with external settings as part of the [Settings Repositories](https://www.jetbrains.com/help/idea/sharing-your-ide-settings.html#settings-repository) feature, but I have not been able to reproduce my settings correctly using this method. You may want to give it a shot with a fork of [this repository](https://github.com/RishabhMalviya/intellij-settings-kotlin-codechef.git).
