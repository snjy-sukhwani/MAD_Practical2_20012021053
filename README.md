# MAD_Practical2_20012021053
This is Practical 2 - MAKING FIRST ANDROID APP in Android Studio for Mobile Application Development(MAD).

## Creating New Project in Android Studio
First of all, Open Android Studio

![image](https://user-images.githubusercontent.com/110806025/187028644-4b613577-f084-4bf3-a305-55d1a5b51d33.png)

Click on Create **```New Project```** and Select **```Empty Activity```**

![image](https://user-images.githubusercontent.com/110806025/187028703-ab2e443c-16b6-4e14-ba7f-1e5811c4d64e.png)

On Clicking Next, we will get the details of the Project like **Project Name,Language,API,Project Location, etc . . .**

![image](https://user-images.githubusercontent.com/110806025/187028689-66810d88-5d52-474c-8281-67c117344acf.png)

By Clicking **"Help Me Choose"**, You can See which API Level will be more effective and will work in how many devices
You can get the Details of the Respective API by Clicking on It

![image](https://user-images.githubusercontent.com/110806025/187028728-7f6076be-9865-4e6c-a54d-0a5bda8d47fa.png)

Close the **API Version Distribution** Window
Click on **```Finish```** Button of New Project Window to Create Your Project
and Then your Project will be Created

After the Project will be Created *[It will take time to download Gradle and all the dependencies]*
This will be the First Screen on Creating Application

![image](https://user-images.githubusercontent.com/110806025/187028813-0d3050db-b832-4141-ac8e-b4484aa847e0.png)

## Files in Android Project

### activity_main.xml
- This is a XML File which is responsible for the Designing part of our Application
- It is like HTML but in XML we can create our Own Tags
- Also There is a Option of Code and Design i.e, The code will be automatically generated just by our Design
- We can just drag and drop the Components from the Palette Menu/Window in the required place in our design part
- Path of the File (*activity_main.xml*) : **```Project-Name\app\src\main\res\layout\activity_main.xml```**
- This is activity_main.xml file [White Screen is our main Application Design and the Blue Screen is the Blueprint of our Application]

  ![image](https://user-images.githubusercontent.com/110806025/187029249-df7444dc-278e-4f4d-85a3-c748a0d74fb7.png)

- To remove the **Blueprint** of the Application, select the blue layered icon from the Design View and in it select **```Design```**

  ![image](https://user-images.githubusercontent.com/110806025/187029344-68a05df8-b30c-4b20-8ee5-fef14d8393e8.png)

- To get the Mobile Phone View of the App just check for the **```Show System UI```** option in Eye icon of designning

  ![image](https://user-images.githubusercontent.com/110806025/187029046-04bf3c2c-26dd-4584-97df-25bdc830bb64.png)

- On Clicking the **```Show System UI```** Option, we will get the UI of Phone as Well

  ![image](https://user-images.githubusercontent.com/110806025/187029089-ccc3624b-b9f4-48c1-a4d7-05541b5c7927.png)

- To get the Code of the *activity_main.xml*, you can see the option for **``` Code | Split | Design ```** in the right side

  ![Screenshot (1170)_0](https://user-images.githubusercontent.com/110806025/187029825-724b3c3e-4c0c-4309-a358-c102e53a7c0a.png)

- In **```Code```**, you will only get Code of *activity_main.xml*, In **```Design```**, You will get the Design of the *activity_main.xml* only BUT if you want both you can use **```Split```** Option

  ![image](https://user-images.githubusercontent.com/110806025/187029898-17a74f81-acff-4449-9d82-ceedd576acf0.png)


### MainActivity.kt
- This is a Kotlin File which is responsible for the Logical part of our Application
- It is like brain of the Application as it will decide what to do and when
- According to the persepective of the website, Kotlin File is like JavaScript similarly XML file is like HTML and CSS
- Path of the File (*MainActivity.kt*) : **```Project-Name\app\src\main\java\com\example\mad_practical2_200120201053\MainActivity.kt```**
- This is MainActivity.kt file 

  ![image](https://user-images.githubusercontent.com/110806025/187030105-f6ae7761-0187-4fe2-8849-0157f9498a34.png)

## Activity Life Cycle

- This is a Life Cycle of an Android Activity

  ![Android-Activity-Lifecycle](https://user-images.githubusercontent.com/110806025/187030993-ff77e47b-a179-4e6e-af8e-89b2cce99950.png)

### onCreate Event
- onCreate Event : Fires when the system first creates the activity
- On activity creation, the activity enters the Created state.
- After the onCreate() method finishes execution, the activity enters the Started state.
- and the system calls the onStart() and onResume() methods.

### onStart() Event
- When the activity enters the Started state, the system invokes this callback.
- The onStart() call makes the activity visible to the user, as the app prepares for the activity to enter the foreground and become interactive.
- Once this callback finishes, the activity enters the Resumed state, and the system invokes the onResume() method.

### onResume() Event
- When the activity enters the Resumed state, it comes to the foreground, and then the system invokes the onResume() callback.
- This is the state in which the app interacts with the user.
- The app stays in this state until something happens to take focus away from the app.
- When an interruptive event occurs, the activity enters the Paused state, and the system invokes the onPause() callback.
- If the activity returns to the Resumed state from the Paused state, the system once again calls onResume() method.

### onPause() Event
- The system calls this method as the first indication that the user is leaving your activity (though it does not always mean the activity is being destroyed); it indicates that the activity is no longer in the foreground (though it may still be visible if the user is in multi-window mode).
- Use the onPause() method to pause or adjust operations that should not continue (or should continue in moderation) while the Activity is in the Paused state,and that you expect to resume shortly.
- Completion of the onPause() method does not mean that the activity leaves the Paused state.
- Rather, the activity remains in this state until either the activity resumes or becomes completely invisible to the user.
- If the activity resumes, the system once again invokes the onResume() callback.

### onStop() Event
- When your activity is no longer visible to the user, it has entered the Stopped state, and the system invokes the onStop() callback.
- In the onStop() method, the app should release or adjust resources that are not needed while the app is not visible to the user.
- From the Stopped state, the activity either comes back to interact with the user, or the activity is finished running and goes away.
- If the activity comes back, the system invokes onRestart().
- If the Activity is finished running, the system calls onDestroy().

### onRestart() Event
- Called after onStop() when the current activity is being re-displayed to the user (the user has navigated back to it).
- It will be followed by onStart() and then onResume().

### onDestroy() Event
- onDestroy() is called before the activity is destroyed. The system invokes this callback either because:
  - the activity is finishing
  - the system is temporarily destroying the activity

## Exercise : Create a “Hello World” application which has a yellow layout background with red color,20sp font size and display text on the center of the screen.

### Solution : 

**Exercise File : MainActivity.kt**
  ![image](https://user-images.githubusercontent.com/110806025/187234152-f8bcbcff-8869-4f59-b5b1-f01d221cea7c.png)

**Exercise File : activity_main.xml**
  ![image](https://user-images.githubusercontent.com/110806025/187234899-f70d8564-ba5c-46ba-b625-5b6990fcbe6f.png)

**NOTE :** <br>
  **MainActivity.kt Code :```app\src\main\java\com\example\mad_practical2_200120201053\MainActivity.kt```**  
  **activity_main.xml Code : ```app\src\main\res\layout\activity_main.xml```**

### Output [Logcat]

![image](https://user-images.githubusercontent.com/110806025/187268476-c77ff603-4c16-41f0-a3f9-674047bf6370.png)

### Output [Screenshots]

When we Open the Application First Time :

When we Open the Application after some other activity :

When we closes the application :

<img src="https://user-images.githubusercontent.com/110806025/187269056-7c575b53-eca4-477b-83cb-247aae138183.PNG" width="10%"><img src="https://user-images.githubusercontent.com/110806025/187269057-0c386e7c-4d46-4800-8e04-70bee2229cd2.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269061-708d91fe-003e-4c67-b654-40029cfa763c.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269045-26242edd-9682-45d2-864a-edbdf64d9a46.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269050-f53f66fb-269d-4bb8-bbef-3c25ce6a2c48.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269054-3b660217-38f9-4e3a-b96e-07e043aef680.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269026-e8489bae-84cd-46ac-9558-7c9af4bcea93.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269031-c07b63b6-53ab-48f2-bf6e-340ae82bccde.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269034-8e8f3f4f-37cf-44ac-bdb0-44f8a56bca8b.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269036-918e458a-704c-4d6d-91cb-de29f74d87c3.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269037-000d0705-c3cd-4e51-9302-82a779eed489.PNG" width="10%">
<img src="https://user-images.githubusercontent.com/110806025/187269042-cf352669-9da9-4747-8008-012640781e07.PNG" width="10%">

