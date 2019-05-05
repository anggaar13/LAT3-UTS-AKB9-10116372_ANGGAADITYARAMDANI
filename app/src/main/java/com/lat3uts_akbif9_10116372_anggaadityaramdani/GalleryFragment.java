package com.lat3uts_akbif9_10116372_anggaadityaramdani;

/*3-April-2019
  10115372
  Akb-if9
  Angga Aditya Ramdani
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {


    List<gallery> lstgallery ;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ricycleview_gallery, container, false);

        lstgallery = new ArrayList<>();
        lstgallery.add(new gallery("Angga",R.drawable.ic_1));
        lstgallery.add(new gallery("Angga",R.drawable.ic_2));
        lstgallery.add(new gallery("Angga",R.drawable.ic_4));
        lstgallery.add(new gallery("Angga",R.drawable.ic_5));
        lstgallery.add(new gallery("Angga",R.drawable.ic_6));


        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recycler_view);
        RicycleGalleryAdapter myAdapter = new RicycleGalleryAdapter(this.getContext(),lstgallery);
        myrv.setLayoutManager(new GridLayoutManager(this.getActivity(),2));
        myrv.setAdapter(myAdapter);

        return view;
    }
}
