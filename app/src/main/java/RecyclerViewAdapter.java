import android.content.Context;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderingapp.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mMenu = new ArrayList<>();
    private ArrayList<String> mBurgerText = new ArrayList<>();
    private ArrayList<String> mFriesText = new ArrayList<>();
    private ArrayList<String> mPizzaText = new ArrayList<>();
    private ArrayList<String> mChickenText = new ArrayList<>();
    private ArrayList<String> mSandwichText = new ArrayList<>();
    private ArrayList<String> mTacoText = new ArrayList<>();
    private ArrayList<String> mBurritoText = new ArrayList<>();
    private ArrayList<String> mSaladText = new ArrayList<>();
    private ArrayList<String> mSushiText = new ArrayList<>();
    private ArrayList<String> mPancakesText = new ArrayList<>();
    private ArrayList<String> mCakeText = new ArrayList<>();
    private ArrayList<String> mDonutText = new ArrayList<>();
    private ArrayList<String> mIceCreamText = new ArrayList<>();
    private ArrayList<String> mSodaText = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mMenu, ArrayList<String> mBurgerText, ArrayList<String> mFriesText, ArrayList<String> mPizzaText, ArrayList<String> mChickenText, ArrayList<String> mSandwichText, ArrayList<String> mTacoText, ArrayList<String> mBurritoText, ArrayList<String> mSaladText, ArrayList<String> mSushiText, ArrayList<String> mPancakesText, ArrayList<String> mCakeText, ArrayList<String> mDonutText, ArrayList<String> mIceCreamText, ArrayList<String> mSodaText, Context mContext) {
        this.mMenu = mMenu;
        this.mBurgerText = mBurgerText;
        this.mFriesText = mFriesText;
        this.mPizzaText = mPizzaText;
        this.mChickenText = mChickenText;
        this.mSandwichText = mSandwichText;
        this.mTacoText = mTacoText;
        this.mBurritoText = mBurritoText;
        this.mSaladText = mSaladText;
        this.mSushiText = mSushiText;
        this.mPancakesText = mPancakesText;
        this.mCakeText = mCakeText;
        this.mDonutText = mDonutText;
        this.mIceCreamText = mIceCreamText;
        this.mSodaText = mSodaText;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlist, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        final int d = Log.d(TAG, "onBindViewHolder: called.");

        holder.menu.setText(mMenu.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int d = Log.d(TAG, "onClick; clicked on: " + mMenu.get(position));

                Toast.makeText(mContext, mMenu.get(position), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return mMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout parentLayout;
        TextView menu;
        TextView burgerText;
        TextView friesText;
        TextView pizzaText;
        TextView hotDogText;
        TextView chickenText;
        TextView sandwichText;
        TextView tacoText;
        TextView burritoText;
        TextView saladText;
        TextView sushiText;
        TextView pancakesText;
        TextView cakeText;
        TextView donutText;
        TextView iceCreamText;
        TextView sodaText;

        public ViewHolder(View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            menu = itemView.findViewById(R.id.menu);
            burgerText = itemView.findViewById(R.id.burgerText);
            friesText = itemView.findViewById(R.id.friesText);
            pizzaText = itemView.findViewById(R.id.pizzaText);
            hotDogText = itemView.findViewById(R.id.hot_dogText);
            chickenText = itemView.findViewById(R.id.chickenText);
            sandwichText = itemView.findViewById(R.id.sandwichText);
            tacoText = itemView.findViewById(R.id.tacoText);
            burritoText = itemView.findViewById(R.id.burritoText);
            saladText = itemView.findViewById(R.id.saladText);
            sushiText = itemView.findViewById(R.id.sushiText);
            pancakesText = itemView.findViewById(R.id.pancakesText);
            cakeText = itemView.findViewById(R.id.cakeText);
            donutText = itemView.findViewById(R.id.donutText);
            iceCreamText = itemView.findViewById(R.id.ice_creamText);
            sodaText = itemView.findViewById(R.id.sodaText);

        }
    }

}





