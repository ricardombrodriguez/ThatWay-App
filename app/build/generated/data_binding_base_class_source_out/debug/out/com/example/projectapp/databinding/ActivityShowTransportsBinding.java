// Generated by view binder compiler. Do not edit!
package com.example.projectapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.projectapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityShowTransportsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final ImageButton homeBtnShowTransports;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final TextView locationShowTransports;

  @NonNull
  public final ImageButton returnBtnShowTransports;

  @NonNull
  public final TextView titleShowTransports;

  private ActivityShowTransportsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guideline2, @NonNull Guideline guideline3,
      @NonNull ImageButton homeBtnShowTransports, @NonNull LinearLayout layout,
      @NonNull TextView locationShowTransports, @NonNull ImageButton returnBtnShowTransports,
      @NonNull TextView titleShowTransports) {
    this.rootView = rootView;
    this.guideline2 = guideline2;
    this.guideline3 = guideline3;
    this.homeBtnShowTransports = homeBtnShowTransports;
    this.layout = layout;
    this.locationShowTransports = locationShowTransports;
    this.returnBtnShowTransports = returnBtnShowTransports;
    this.titleShowTransports = titleShowTransports;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityShowTransportsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityShowTransportsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_show_transports, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityShowTransportsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.homeBtnShowTransports;
      ImageButton homeBtnShowTransports = rootView.findViewById(id);
      if (homeBtnShowTransports == null) {
        break missingId;
      }

      id = R.id.layout;
      LinearLayout layout = rootView.findViewById(id);
      if (layout == null) {
        break missingId;
      }

      id = R.id.locationShowTransports;
      TextView locationShowTransports = rootView.findViewById(id);
      if (locationShowTransports == null) {
        break missingId;
      }

      id = R.id.returnBtnShowTransports;
      ImageButton returnBtnShowTransports = rootView.findViewById(id);
      if (returnBtnShowTransports == null) {
        break missingId;
      }

      id = R.id.titleShowTransports;
      TextView titleShowTransports = rootView.findViewById(id);
      if (titleShowTransports == null) {
        break missingId;
      }

      return new ActivityShowTransportsBinding((ConstraintLayout) rootView, guideline2, guideline3,
          homeBtnShowTransports, layout, locationShowTransports, returnBtnShowTransports,
          titleShowTransports);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
