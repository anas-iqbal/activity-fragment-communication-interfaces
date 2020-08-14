    package com.example.anasiqbal.fragmentscommunication;

    import android.app.Activity;
    import android.os.Bundle;
    import android.support.annotation.NonNull;
    import android.support.annotation.Nullable;
    import android.support.v4.app.Fragment;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.Button;


    public class FragmentTwo extends Fragment {

        Button frag2btn;
        ClickInterface clickInterface;

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            clickInterface = (ClickInterface) activity;
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment2, container, false);
            frag2btn=view.findViewById(R.id.frag2btn);
            frag2btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickInterface.frag2btnClicked();
                }
            });

            return view;
        }

        public interface ClickInterface {
            public void frag2btnClicked();
        }


    }


