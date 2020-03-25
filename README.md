# Randomizer
> Kotlin app made in android studio. Generate random number.

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Setup](#setup)
* [Features](#features)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
Mobile app that generate random number, write in Kotlin as part of my learning, just simple app, not to much to say. Made in Android Studio.

## Screenshots
![](https://github.com/MarkoVitkovic/Randomizer_java/blob/master/random.png)

## Technologies
* [Kotlin](https://kotlinlang.org/docs/reference/kotlin-doc.html)


## Setup
To create your new Android project, follow these steps:</br>

1.Install the latest version of Android Studio.</br>
2.In the Welcome to Android Studio window, click Start a new Android Studio project.</br>
![](https://developer.android.com/training/basics/firstapp/images/studio-welcome_2x.png)</br>
3.In the Select a Project Template window, select Empty Activity and click Next.</br>
4.In the Configure your project window, complete the following:</br>
* Enter "My First App" in the Name field.</br>
* Enter "com.example.myfirstapp" in the Package name field.</br>
* If you'd like to place the project in a different folder, change its Save location.</br>
* Select either Java or Kotlin from the Language drop-down menu.</br>
* Select the lowest version of Android your app will support in the Minimum SDK field.</br>
* If your app will require legacy library support, mark the Use legacy android.support libraries checkbox.</br>
* Leave the other options as they are.</br>
5.Click Finish.</br>
![](https://developer.android.com/training/basics/firstapp/images/studio-editor_2x.png)




## Code Examples
Code:</br>
` val switch=findViewById<Switch>(R.id.switch3)`</br>
        `val goButton = findViewById<Button>(R.id.goButton)`</br>
        `val textViewResult = findViewById<TextView>(R.id.textViewResult)`</br>
        `val editText = findViewById<EditText>(R.id.editTexts)`</br>
 `goButton.setOnClickListener {`</br>
            `val txt = editText.text.toString().toInt()`</br>
            `val rand = java.util.Random().nextInt(txt)+1`</br>
           ` textViewResult.text=rand.toString()`</br>



## Features
List of features ready and TODOs for future development
* Generate random number 

To-do list:
* none

## Status
Project is: _finished_

## Inspiration
As a project for my study.

## Contact
Created by [Marko Vitkovic](https://github.com/MarkoVitkovic) - feel free to contact me!
