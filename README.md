# NoteBook
This Notebook was created for android minSDK 19 , targetSDk 30 

Notepad was created for keeping records, adding photos, links

![Main Menu](https://github.com/bogoslovskiydenis/NoteBook/blob/master/MainMenu.jpg)             ![Create Notes](https://github.com/bogoslovskiydenis/NoteBook/blob/master/CreateNotes.jpg)


Used libraries

    //Room database https://developer.android.com/training/data-storage/room#java
    implementation 'androidx.room:room-runtime:2.3.0'
    annotationProcessor 'androidx.room:room-compiler:2.3.0'

    //RecyclerView  https://developer.android.com/jetpack/androidx/releases/recyclerview
    implementation 'androidx.recyclerview:recyclerview:1.2.0'

    //Scratable Size Unit ->support for different screeen sizes https://github.com/intuit/sdp
    implementation 'com.intuit.sdp:sdp-android:1.0.6'
    implementation 'com.intuit.ssp:ssp-android:1.0.6'

    //Material Desighn https://material.io/develop/android/docs/getting-started/
    implementation 'com.google.android.material:material:1.3.0'

    //Rounder ImageView  https://github.com/vinc3m1/RoundedImageView
    implementation 'com.makeramen:roundedimageview:2.3.0'
