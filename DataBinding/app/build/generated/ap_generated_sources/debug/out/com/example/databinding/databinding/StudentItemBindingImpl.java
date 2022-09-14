package com.example.databinding.databinding;
import com.example.databinding.R;
import com.example.databinding.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StudentItemBindingImpl extends StudentItemBinding  {

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

    public StudentItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private StudentItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.ivImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvNameStudent.setTag(null);
        this.tvNimStudent.setTag(null);
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
        if (BR.student == variableId) {
            setStudent((com.example.databinding.dbrecyclerview.Student) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setStudent(@Nullable com.example.databinding.dbrecyclerview.Student Student) {
        this.mStudent = Student;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.student);
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
        java.lang.String studentNim = null;
        com.example.databinding.dbrecyclerview.Student student = mStudent;
        java.lang.String studentName = null;
        int studentImg = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (student != null) {
                    // read student.nim
                    studentNim = student.getNim();
                    // read student.name
                    studentName = student.getName();
                    // read student.img
                    studentImg = student.getImg();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.ivImage.setImageResource(studentImg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNameStudent, studentName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNimStudent, studentNim);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): student
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}