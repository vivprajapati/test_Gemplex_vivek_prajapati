package com.example.task_vivek_prajapati;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.task_vivek_prajapati.adapter.AdapterHome;
import com.example.task_vivek_prajapati.adapter.MaterialCircular;
import com.example.task_vivek_prajapati.models.PojoHomeList;
import com.example.task_vivek_prajapati.models.PojoItems;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class VideoFragment extends Fragment {
    SliderView sliderView;
    private SliderAdapter adapter;
    List<SliderItem> sliderItems = new ArrayList<>();
    RecyclerView recyclerView, recyclerView1, recyclerView2, recyclerView3, recyclerView4, recyclerView5, recyclerView6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        sliderView = view.findViewById(R.id.imageSlider);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView1 = view.findViewById(R.id.recyclerView1);
        recyclerView2 = view.findViewById(R.id.recyclerView2);
        recyclerView3 = view.findViewById(R.id.recyclerView3);
        recyclerView4 = view.findViewById(R.id.recyclerView4);
        recyclerView5 = view.findViewById(R.id.recyclerView5);
        recyclerView6 = view.findViewById(R.id.recyclerView6);



        setData();

        setImages();
        adapter = new SliderAdapter(getActivity(), sliderItems);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + sliderView.getCurrentPagePosition());
            }
        });

        return view;
    }

    private void setData() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterHome adapterHome = new AdapterHome(getContext(), getDummyData5());
        recyclerView.setAdapter(adapterHome);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterHome adapterHome1 = new AdapterHome(getContext(), getDummyData1());
        recyclerView1.setAdapter(adapterHome1);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterHome adapterHome2 = new AdapterHome(getContext(), getDummyData2());
        recyclerView2.setAdapter(adapterHome2);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterHome adapterHome3 = new AdapterHome(getContext(), getDummyData3());
        recyclerView3.setAdapter(adapterHome3);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterHome adapterHome4 = new AdapterHome(getContext(), getDummyData4());
        recyclerView4.setAdapter(adapterHome4);
        recyclerView5.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterHome adapterHome5 = new AdapterHome(getContext(), getDummyData());
        recyclerView5.setAdapter(adapterHome5);

    }

    private List<PojoHomeList> getDummyData() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("Matkiphod", "https://images.unsplash.com/photo-1415296899237-424b0513d567?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1355&q=80"));
        items.add(new PojoItems("Shephards From Hell", "https://images.unsplash.com/photo-1445519190187-d74afcf940b3?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1267&q=80"));
        items.add(new PojoItems("Lips Don't Lie", "https://images.unsplash.com/photo-1583027231770-9828b846069e?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Cookiees", "https://images.unsplash.com/photo-1591128388125-2bf13330ff6d?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1267&q=80"));
        items.add(new PojoItems("CourtYard 704", "https://images.unsplash.com/photo-1465237501645-dc958607f396?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1351&q=80"));

        data.add(new PojoHomeList("Series", items));

        return data;
    } private List<PojoHomeList> getDummyData1() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("The Oldest and The \nBoldest", "https://images.unsplash.com/photo-1583027231817-0bf8aa97aeba?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Khane Ke Deewane", "https://images.unsplash.com/photo-1580244613605-924dbf4609de?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1318&q=80"));
        items.add(new PojoItems("Bollywood Gurukul", "https://images.unsplash.com/photo-1588945132780-a66cc8c5621c?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1350&q=80"));

        data.add(new PojoHomeList("Non Fiction", items));

        return data;
    } private List<PojoHomeList> getDummyData2() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("Z43", "https://images.unsplash.com/photo-1583059439119-5da0e881baa9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Bhoot Bari", "https://images.unsplash.com/photo-1603081463895-e27e22259ec0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));

        data.add(new PojoHomeList("Exclusive", items));
        return data;
    } private List<PojoHomeList> getDummyData3() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("Yariyaan", "https://images.unsplash.com/photo-1530609208824-d1ff4bd58b0f?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Njd8fGxpbmt8ZW58MHwwfDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
        items.add(new PojoItems("Humnava", "https://images.unsplash.com/photo-1612860173150-1b469df784cc?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1267&q=80"));
        items.add(new PojoItems("Agomoni", "https://images.unsplash.com/photo-1502773779955-99a8ab685dae?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("lassi", "https://images.unsplash.com/photo-1516466045554-368f2d670d7c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));

        data.add(new PojoHomeList("Musicals", items));
        return data;
    } private List<PojoHomeList> getDummyData4() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("madam", "https://images.unsplash.com/photo-1584824486509-112e4181ff6b?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("The Penitents", "https://images.unsplash.com/photo-1514826674927-51633f26dfaa?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Fallen", "https://images.unsplash.com/photo-1563434028363-9078633e5a93?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1267&q=80"));
        items.add(new PojoItems("VDA", "https://images.unsplash.com/photo-1514827387294-037ee5cc2687?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1350&q=80"));

        data.add(new PojoHomeList("Sorts", items));

        return data;
    } private List<PojoHomeList> getDummyData5() {
        List<PojoHomeList> data = new ArrayList<>();
        List<PojoItems> items = new ArrayList<>();
        items.add(new PojoItems("The Last Minute", "https://images.unsplash.com/photo-1519602857797-2d5beada21f6?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"));
        items.add(new PojoItems("Gurugram", "https://images.unsplash.com/photo-1526498460520-4c246339dccb?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Silence of Sleep", "https://images.unsplash.com/photo-1593093403152-9bd02e0e8181?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        items.add(new PojoItems("Master", "https://images.unsplash.com/photo-1589044887279-6b8cf36548de?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1491&q=80"));
        items.add(new PojoItems("Ek the Haveli", "https://images.unsplash.com/photo-1604375318488-4bf6119edb15?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1355&q=80"));

        data.add(new PojoHomeList("Original Web Film", items));
        return data;
    }


    private void setImages() {
        sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem("https://images.unsplash.com/photo-1568963099947-1d730a365d29?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80"));
        sliderItems.add(new SliderItem("https://images.unsplash.com/photo-1576694225384-154cee057baf?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1400&q=80"));
        sliderItems.add(new SliderItem("https://images.unsplash.com/photo-1600867161422-79f8f6e08c84?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1351&q=80"));
        sliderItems.add(new SliderItem("https://images.unsplash.com/photo-1544772324-f4d09246d48b?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1267&q=80"));
        sliderItems.add(new SliderItem("https://images.unsplash.com/photo-1588945132780-a66cc8c5621c?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1350&q=80"));

    }

}