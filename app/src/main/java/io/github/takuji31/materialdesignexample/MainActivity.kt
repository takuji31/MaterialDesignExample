package io.github.takuji31.materialdesignexample

import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem


public class MainActivity : AppCompatActivity(), TopFragment.OnFragmentInteractionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val fragment = getSupportFragmentManager().findFragmentById(R.id.container);
        if (fragment == null) {
            val topFragment = TopFragment.newInstance()
            val ft = getSupportFragmentManager().beginTransaction()
            ft.replace(R.id.container, topFragment)
            ft.commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item!!.getItemId()

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true
        }

        return super<AppCompatActivity>.onOptionsItemSelected(item)
    }

    override fun onAppCompatWidgetButtonTapped() {
        val fragment = AppCompatWidgetFragment.newInstance()
        val ft = getSupportFragmentManager().beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.addToBackStack(null)
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        ft.commit()
    }

    override fun onThirdPartyLibsButtonTapped() {
    }
}
