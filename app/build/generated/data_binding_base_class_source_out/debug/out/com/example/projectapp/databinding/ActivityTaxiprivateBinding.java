// Generated by view binder compiler. Do not edit!
package com.example.projectapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.projectapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTaxiprivateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextTextMultiLine4;

  @NonNull
  public final EditText editTextTextMultiLine5;

  @NonNull
  public final EditText editTextTextMultiLine6;

  @NonNull
  public final EditText editTextTextMultiLine7;

  @NonNull
  public final EditText editTextTextMultiLine8;

  @NonNull
  public final ImageButton homeBtnShowTransports6;

  @NonNull
  public final TextView locationShowTransports2;

  @NonNull
  public final ImageButton returnBtn6;

  @NonNull
  public final TextView title;

  private ActivityTaxiprivateBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editTextTextMultiLine4, @NonNull EditText editTextTextMultiLine5,
      @NonNull EditText editTextTextMultiLine6, @NonNull EditText editTextTextMultiLine7,
      @NonNull EditText editTextTextMultiLine8, @NonNull ImageButton homeBtnShowTransports6,
      @NonNull TextView locationShowTransports2, @NonNull ImageButton returnBtn6,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.editTextTextMultiLine4 = editTextTextMultiLine4;
    this.editTextTextMultiLine5 = editTextTextMultiLine5;
    this.editTextTextMultiLine6 = editTextTextMultiLine6;
    this.editTextTextMultiLine7 = editTextTextMultiLine7;
    this.editTextTextMultiLine8 = editTextTextMultiLine8;
    this.homeBtnShowTransports6 = homeBtnShowTransports6;
    this.locationShowTransports2 = locationShowTransports2;
    this.returnBtn6 = returnBtn6;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTaxiprivateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTaxiprivateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_taxiprivate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTaxiprivateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextTextMultiLine4;
      EditText editTextTextMultiLine4 = rootView.findViewById(id);
      if (editTextTextMultiLine4 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine5;
      EditText editTextTextMultiLine5 = rootView.findViewById(id);
      if (editTextTextMultiLine5 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine6;
      EditText editTextTextMultiLine6 = rootView.findViewById(id);
      if (editTextTextMultiLine6 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine7;
      EditText editTextTextMultiLine7 = rootView.findViewById(id);
      if (editTextTextMultiLine7 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine8;
      EditText editTextTextMultiLine8 = rootView.findViewById(id);
      if (editTextTextMultiLine8 == null) {
        break missingId;
      }

      id = R.id.homeBtnShowTransports6;
      ImageButton homeBtnShowTransports6 = rootView.findViewById(id);
      if (homeBtnShowTransports6 == null) {
        break missingId;
      }

      id = R.id.locationShowTransports2;
      TextView locationShowTransports2 = rootView.findViewById(id);
      if (locationShowTransports2 == null) {
        break missingId;
      }

      id = R.id.returnBtn6;
      ImageButton returnBtn6 = rootView.findViewById(id);
      if (returnBtn6 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      return new ActivityTaxiprivateBinding((ConstraintLayout) rootView, editTextTextMultiLine4,
          editTextTextMultiLine5, editTextTextMultiLine6, editTextTextMultiLine7,
          editTextTextMultiLine8, homeBtnShowTransports6, locationShowTransports2, returnBtn6,
          title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
