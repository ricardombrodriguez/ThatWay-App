// Generated by view binder compiler. Do not edit!
package com.example.projectapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.projectapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCtLocationsFiltersBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView CTLocationFiltersTextView;

  @NonNull
  public final Button addBreakpoint;

  @NonNull
  public final ConstraintLayout container1;

  @NonNull
  public final ConstraintLayout container2;

  @NonNull
  public final AutoCompleteTextView destino;

  @NonNull
  public final Button filtersBtn1;

  @NonNull
  public final ImageButton homeBtnShowTransports2;

  @NonNull
  public final LinearLayout layoutList;

  @NonNull
  public final AutoCompleteTextView origem;

  @NonNull
  public final ImageButton returnBtn2;

  @NonNull
  public final Button searchResultsBtn;

  @NonNull
  public final ImageButton swapBtn;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  private ActivityCtLocationsFiltersBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView CTLocationFiltersTextView, @NonNull Button addBreakpoint,
      @NonNull ConstraintLayout container1, @NonNull ConstraintLayout container2,
      @NonNull AutoCompleteTextView destino, @NonNull Button filtersBtn1,
      @NonNull ImageButton homeBtnShowTransports2, @NonNull LinearLayout layoutList,
      @NonNull AutoCompleteTextView origem, @NonNull ImageButton returnBtn2,
      @NonNull Button searchResultsBtn, @NonNull ImageButton swapBtn, @NonNull TextView textView10,
      @NonNull TextView textView11) {
    this.rootView = rootView;
    this.CTLocationFiltersTextView = CTLocationFiltersTextView;
    this.addBreakpoint = addBreakpoint;
    this.container1 = container1;
    this.container2 = container2;
    this.destino = destino;
    this.filtersBtn1 = filtersBtn1;
    this.homeBtnShowTransports2 = homeBtnShowTransports2;
    this.layoutList = layoutList;
    this.origem = origem;
    this.returnBtn2 = returnBtn2;
    this.searchResultsBtn = searchResultsBtn;
    this.swapBtn = swapBtn;
    this.textView10 = textView10;
    this.textView11 = textView11;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCtLocationsFiltersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCtLocationsFiltersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ct_locations_filters, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCtLocationsFiltersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.CT_LocationFiltersTextView;
      TextView CTLocationFiltersTextView = rootView.findViewById(id);
      if (CTLocationFiltersTextView == null) {
        break missingId;
      }

      id = R.id.addBreakpoint;
      Button addBreakpoint = rootView.findViewById(id);
      if (addBreakpoint == null) {
        break missingId;
      }

      id = R.id.container1;
      ConstraintLayout container1 = rootView.findViewById(id);
      if (container1 == null) {
        break missingId;
      }

      id = R.id.container2;
      ConstraintLayout container2 = rootView.findViewById(id);
      if (container2 == null) {
        break missingId;
      }

      id = R.id.destino;
      AutoCompleteTextView destino = rootView.findViewById(id);
      if (destino == null) {
        break missingId;
      }

      id = R.id.filtersBtn1;
      Button filtersBtn1 = rootView.findViewById(id);
      if (filtersBtn1 == null) {
        break missingId;
      }

      id = R.id.homeBtnShowTransports2;
      ImageButton homeBtnShowTransports2 = rootView.findViewById(id);
      if (homeBtnShowTransports2 == null) {
        break missingId;
      }

      id = R.id.layout_list;
      LinearLayout layoutList = rootView.findViewById(id);
      if (layoutList == null) {
        break missingId;
      }

      id = R.id.origem;
      AutoCompleteTextView origem = rootView.findViewById(id);
      if (origem == null) {
        break missingId;
      }

      id = R.id.returnBtn2;
      ImageButton returnBtn2 = rootView.findViewById(id);
      if (returnBtn2 == null) {
        break missingId;
      }

      id = R.id.searchResultsBtn;
      Button searchResultsBtn = rootView.findViewById(id);
      if (searchResultsBtn == null) {
        break missingId;
      }

      id = R.id.swapBtn;
      ImageButton swapBtn = rootView.findViewById(id);
      if (swapBtn == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = rootView.findViewById(id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = rootView.findViewById(id);
      if (textView11 == null) {
        break missingId;
      }

      return new ActivityCtLocationsFiltersBinding((ConstraintLayout) rootView,
          CTLocationFiltersTextView, addBreakpoint, container1, container2, destino, filtersBtn1,
          homeBtnShowTransports2, layoutList, origem, returnBtn2, searchResultsBtn, swapBtn,
          textView10, textView11);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
