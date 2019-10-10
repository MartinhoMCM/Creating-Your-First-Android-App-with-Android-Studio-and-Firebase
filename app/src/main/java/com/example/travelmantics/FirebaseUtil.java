package com.example.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {

    public static FirebaseDatabase mFirebaseDatabase;
    public static DatabaseReference mDatabaseReference;
    public static FirebaseUtil mFirebaseUtil;
    public  static ArrayList<TravelDeal>  mDeals;

    private FirebaseUtil(){};

    public  static  void openReference(String ref)
    {
        if(mFirebaseUtil ==null)
        {
            mFirebaseUtil = new FirebaseUtil();
            mFirebaseDatabase =FirebaseDatabase.getInstance();
            mDeals = new ArrayList<>();

        }
        mDatabaseReference=mFirebaseDatabase.getReference().child(ref);

    }

}
