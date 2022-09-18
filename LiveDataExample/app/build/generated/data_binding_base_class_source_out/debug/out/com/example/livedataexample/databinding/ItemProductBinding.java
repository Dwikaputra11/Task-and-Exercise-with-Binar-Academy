// Generated by data binding compiler. Do not edit!
package com.example.livedataexample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.livedataexample.R;
import com.example.livedataexample.data.Product;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProductBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivProduct;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvStock;

  @Bindable
  protected Product mProduct;

  protected ItemProductBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivProduct, TextView tvName, TextView tvPrice, TextView tvStock) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivProduct = ivProduct;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
    this.tvStock = tvStock;
  }

  public abstract void setProduct(@Nullable Product product);

  @Nullable
  public Product getProduct() {
    return mProduct;
  }

  @NonNull
  public static ItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_product, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProductBinding>inflateInternal(inflater, R.layout.item_product, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_product, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProductBinding>inflateInternal(inflater, R.layout.item_product, null, false, component);
  }

  public static ItemProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemProductBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProductBinding)bind(component, view, R.layout.item_product);
  }
}
