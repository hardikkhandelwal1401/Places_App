// Generated by view binder compiler. Do not edit!
package com.example.happyplaces.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.happyplaces.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddHappyPlaceBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final AppCompatEditText etDate;

  @NonNull
  public final AppCompatEditText etDescription;

  @NonNull
  public final AppCompatEditText etLocation;

  @NonNull
  public final AppCompatEditText etTitle;

  @NonNull
  public final AppCompatImageView ivPlaceImage;

  @NonNull
  public final ScrollView svMain;

  @NonNull
  public final TextInputLayout tilDate;

  @NonNull
  public final TextInputLayout tilDescription;

  @NonNull
  public final TextInputLayout tilLocation;

  @NonNull
  public final TextInputLayout tilTitle;

  @NonNull
  public final Toolbar toolbarAddPlace;

  @NonNull
  public final TextView tvAddImage;

  @NonNull
  public final TextView tvSelectCurrentLocation;

  private ActivityAddHappyPlaceBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSave,
      @NonNull AppCompatEditText etDate, @NonNull AppCompatEditText etDescription,
      @NonNull AppCompatEditText etLocation, @NonNull AppCompatEditText etTitle,
      @NonNull AppCompatImageView ivPlaceImage, @NonNull ScrollView svMain,
      @NonNull TextInputLayout tilDate, @NonNull TextInputLayout tilDescription,
      @NonNull TextInputLayout tilLocation, @NonNull TextInputLayout tilTitle,
      @NonNull Toolbar toolbarAddPlace, @NonNull TextView tvAddImage,
      @NonNull TextView tvSelectCurrentLocation) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.etDate = etDate;
    this.etDescription = etDescription;
    this.etLocation = etLocation;
    this.etTitle = etTitle;
    this.ivPlaceImage = ivPlaceImage;
    this.svMain = svMain;
    this.tilDate = tilDate;
    this.tilDescription = tilDescription;
    this.tilLocation = tilLocation;
    this.tilTitle = tilTitle;
    this.toolbarAddPlace = toolbarAddPlace;
    this.tvAddImage = tvAddImage;
    this.tvSelectCurrentLocation = tvSelectCurrentLocation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddHappyPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddHappyPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_happy_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddHappyPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.et_date;
      AppCompatEditText etDate = ViewBindings.findChildViewById(rootView, id);
      if (etDate == null) {
        break missingId;
      }

      id = R.id.et_description;
      AppCompatEditText etDescription = ViewBindings.findChildViewById(rootView, id);
      if (etDescription == null) {
        break missingId;
      }

      id = R.id.et_location;
      AppCompatEditText etLocation = ViewBindings.findChildViewById(rootView, id);
      if (etLocation == null) {
        break missingId;
      }

      id = R.id.et_title;
      AppCompatEditText etTitle = ViewBindings.findChildViewById(rootView, id);
      if (etTitle == null) {
        break missingId;
      }

      id = R.id.iv_place_image;
      AppCompatImageView ivPlaceImage = ViewBindings.findChildViewById(rootView, id);
      if (ivPlaceImage == null) {
        break missingId;
      }

      id = R.id.sv_main;
      ScrollView svMain = ViewBindings.findChildViewById(rootView, id);
      if (svMain == null) {
        break missingId;
      }

      id = R.id.til_date;
      TextInputLayout tilDate = ViewBindings.findChildViewById(rootView, id);
      if (tilDate == null) {
        break missingId;
      }

      id = R.id.til_description;
      TextInputLayout tilDescription = ViewBindings.findChildViewById(rootView, id);
      if (tilDescription == null) {
        break missingId;
      }

      id = R.id.til_location;
      TextInputLayout tilLocation = ViewBindings.findChildViewById(rootView, id);
      if (tilLocation == null) {
        break missingId;
      }

      id = R.id.til_title;
      TextInputLayout tilTitle = ViewBindings.findChildViewById(rootView, id);
      if (tilTitle == null) {
        break missingId;
      }

      id = R.id.toolbar_add_place;
      Toolbar toolbarAddPlace = ViewBindings.findChildViewById(rootView, id);
      if (toolbarAddPlace == null) {
        break missingId;
      }

      id = R.id.tv_add_image;
      TextView tvAddImage = ViewBindings.findChildViewById(rootView, id);
      if (tvAddImage == null) {
        break missingId;
      }

      id = R.id.tv_select_current_location;
      TextView tvSelectCurrentLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvSelectCurrentLocation == null) {
        break missingId;
      }

      return new ActivityAddHappyPlaceBinding((ConstraintLayout) rootView, btnSave, etDate,
          etDescription, etLocation, etTitle, ivPlaceImage, svMain, tilDate, tilDescription,
          tilLocation, tilTitle, toolbarAddPlace, tvAddImage, tvSelectCurrentLocation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}