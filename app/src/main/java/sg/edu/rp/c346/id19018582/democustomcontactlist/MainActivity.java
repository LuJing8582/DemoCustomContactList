package sg.edu.rp.c346.id19018582.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //declare
    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind
        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();

        //add to ArrayList
        Contact item1 = new Contact("Mary", 65, 65442334, 'f');
        alContactList.add(item1);

        Contact item2= new Contact("Ken", 65, 97442437, 'm');
        alContactList.add(item2);

        //initialize CustomAdapter to connect it to ListView
        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);
    }
}
