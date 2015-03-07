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

public class Directory {
    private static DirectoryCategory[] mCategories;

    public static void initializeDirectory() {
      mCategories = new DirectoryCategory[] {
                new DirectoryCategory("ΠΛΟΗΓΗΣΗ", new DirectoryEntry[] {
                		
                		new DirectoryEntry("Καλώς Ήρθατε", R.string.Welcome, R.drawable.donut),
                		new DirectoryEntry("Αξιοθέατα", R.string.Axiotheata, R.drawable.froyo),
                       //new DirectoryEntry("Εστιατόρια & Καφετέριες"),
                        //new DirectoryEntry("Νυχτερινή Ζωή", R.string.Nightlife),
                        //new DirectoryEntry("Ώρα για ψώνια", R.string.Shopping),
                        //new DirectoryEntry("Υπηρεσίες Έκτακτης Ανάγκης", R.string.Emergency),
                                              
                		 }),
                new DirectoryCategory("ΧΑΡΤΕΣ", new DirectoryEntry[] {}),
                       
                new DirectoryCategory("ΚΟΝΤΙΝΑ ΣΗΜΕΙΑ", new DirectoryEntry[] {
                       
                         }),
                };

    }
    

    public static int getCategoryCount() {
        return mCategories.length;
    }

    public static DirectoryCategory getCategory(int i) {
        return mCategories[i];
    }
}
