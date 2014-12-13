/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.hcgallery;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;

public class DirectoryEntry {
    private String name;
    private int resID;
    private int resID1;
    private Subcategory[] subs;
    
    public DirectoryEntry(String name, Subcategory[] subs) {
        this.name = name;
        this.subs = subs;
      
    }
    
   

    public int getEntryCount() {
        return subs.length;
    }

    public Subcategory getEntry(int i) {
        return subs[i];
    }
	

    public DirectoryEntry(String name, int resID, int resID1) {
        this.name = name;
        this.resID = resID;
       
    }

    public String getName() {
        return name;
    }

    public String getString(Resources res) {
        return res.getString(resID);
    }
    
    public Drawable getDrawable(Resources res1) {
        return res1.getDrawable(resID1);
    }

    public Bitmap getBitmap(Resources res) {
        return BitmapFactory.decodeResource(res, resID);
    }
}
