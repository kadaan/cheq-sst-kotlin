// Generated by view binder compiler. Do not edit!
package ai.cheq.sst.android.app.databinding;

import ai.cheq.sst.android.app.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBasicSendEventExampleBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ConstraintLayout clientLayout;

  @NonNull
  public final ViewPager2 pager;

  @NonNull
  public final NestedScrollView pagerScrollView;

  @NonNull
  public final TabLayout tabLayout;

  private FragmentBasicSendEventExampleBinding(@NonNull RelativeLayout rootView,
      @NonNull ConstraintLayout clientLayout, @NonNull ViewPager2 pager,
      @NonNull NestedScrollView pagerScrollView, @NonNull TabLayout tabLayout) {
    this.rootView = rootView;
    this.clientLayout = clientLayout;
    this.pager = pager;
    this.pagerScrollView = pagerScrollView;
    this.tabLayout = tabLayout;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBasicSendEventExampleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBasicSendEventExampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_basic_send_event_example, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBasicSendEventExampleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.client_layout;
      ConstraintLayout clientLayout = ViewBindings.findChildViewById(rootView, id);
      if (clientLayout == null) {
        break missingId;
      }

      id = R.id.pager;
      ViewPager2 pager = ViewBindings.findChildViewById(rootView, id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.pager_scroll_view;
      NestedScrollView pagerScrollView = ViewBindings.findChildViewById(rootView, id);
      if (pagerScrollView == null) {
        break missingId;
      }

      id = R.id.tab_layout;
      TabLayout tabLayout = ViewBindings.findChildViewById(rootView, id);
      if (tabLayout == null) {
        break missingId;
      }

      return new FragmentBasicSendEventExampleBinding((RelativeLayout) rootView, clientLayout,
          pager, pagerScrollView, tabLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
