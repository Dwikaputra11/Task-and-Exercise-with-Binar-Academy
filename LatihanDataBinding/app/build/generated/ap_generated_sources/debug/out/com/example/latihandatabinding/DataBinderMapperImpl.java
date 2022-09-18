package com.example.latihandatabinding;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.latihandatabinding.databinding.FragmentDetailNewsBindingImpl;
import com.example.latihandatabinding.databinding.FragmentNewsBindingImpl;
import com.example.latihandatabinding.databinding.NewsItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTDETAILNEWS = 1;

  private static final int LAYOUT_FRAGMENTNEWS = 2;

  private static final int LAYOUT_NEWSITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.latihandatabinding.R.layout.fragment_detail_news, LAYOUT_FRAGMENTDETAILNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.latihandatabinding.R.layout.fragment_news, LAYOUT_FRAGMENTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.latihandatabinding.R.layout.news_item, LAYOUT_NEWSITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTDETAILNEWS: {
          if ("layout/fragment_detail_news_0".equals(tag)) {
            return new FragmentDetailNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_news is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWS: {
          if ("layout/fragment_news_0".equals(tag)) {
            return new FragmentNewsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_news is invalid. Received: " + tag);
        }
        case  LAYOUT_NEWSITEM: {
          if ("layout/news_item_0".equals(tag)) {
            return new NewsItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for news_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "news");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_detail_news_0", com.example.latihandatabinding.R.layout.fragment_detail_news);
      sKeys.put("layout/fragment_news_0", com.example.latihandatabinding.R.layout.fragment_news);
      sKeys.put("layout/news_item_0", com.example.latihandatabinding.R.layout.news_item);
    }
  }
}
