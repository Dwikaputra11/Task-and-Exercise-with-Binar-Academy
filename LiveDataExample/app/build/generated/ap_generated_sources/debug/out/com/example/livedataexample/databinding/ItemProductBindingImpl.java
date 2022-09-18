package com.example.livedataexample.databinding;
import com.example.livedataexample.R;
import com.example.livedataexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductBindingImpl extends ItemProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.ivProduct.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        this.tvPrice.setTag(null);
        this.tvStock.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((com.example.livedataexample.data.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.example.livedataexample.data.Product Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String charIntegerToStringProductPrice = null;
        java.lang.String productName = null;
        int productStock = 0;
        java.lang.String integerToStringProductPrice = null;
        com.example.livedataexample.data.Product product = mProduct;
        java.lang.String integerToStringProductStock = null;
        int productImg = 0;
        int productPrice = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.name
                    productName = product.getName();
                    // read product.stock
                    productStock = product.getStock();
                    // read product.img
                    productImg = product.getImg();
                    // read product.price
                    productPrice = product.getPrice();
                }


                // read Integer.toString(product.stock)
                integerToStringProductStock = java.lang.Integer.toString(productStock);
                // read Integer.toString(product.price)
                integerToStringProductPrice = java.lang.Integer.toString(productPrice);


                // read ('$') + (Integer.toString(product.price))
                charIntegerToStringProductPrice = ('$') + (integerToStringProductPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.ivProduct.setImageResource(productImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, productName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, charIntegerToStringProductPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvStock, integerToStringProductStock);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}