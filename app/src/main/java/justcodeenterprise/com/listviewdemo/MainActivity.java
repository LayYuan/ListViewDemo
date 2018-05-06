package justcodeenterprise.com.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //1. Create myListView ID
//        ListView myListView = findViewById(R.id.myLIstView);
//
//        //2. Create ArrayList myFamily coding
//        final ArrayList<String> myFamily = new ArrayList<String>();
//        myFamily.add("Jo");
//        myFamily.add("Gordan");
//        myFamily.add("Gary");
//        myFamily.add("Kris");
//
//
//        //3. Create ArrayAdapted connect the myFamily ArrayList Coding
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
//
//        //4 connect Adapted with myListView ID
//        myListView.setAdapter(arrayAdapter);
//
//        //5 When the item list is click
//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Log.i("person Selected", myFamily.get(i));
//            }
//        });

        //1 Create List ID
        ListView myListView = findViewById(R.id.myListView);

        //2 Create ArrayList
//        ArrayList<String> myFriends = new ArrayList<String>();
//        myFriends.add("Mango");
//        myFriends.add("Alicia");
//        myFriends.add("Daniel");
        final ArrayList<String> myFriends = new ArrayList<String>(asList("Mark", "Jane", "Sussy"));

        //3 Create Adaptor
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends );

        //4 link adaptor
        myListView.setAdapter(arrayAdapter);

        //5 onclick
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Love u myFriend, " + myFriends.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
