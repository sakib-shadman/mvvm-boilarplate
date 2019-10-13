package com.jontromanob.app.mvvm_retrofit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jontromanob.app.mvvm_retrofit.R;
import com.jontromanob.app.mvvm_retrofit.retrofit.leaveapplication.model.LeaveApplicationDetails;
import com.jontromanob.app.mvvm_retrofit.retrofit.login.model.LogInResponse;
import com.jontromanob.app.mvvm_retrofit.util.SaveUserInformationUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ankon on 3/30/2018.
 */

public class LeaveApplicationDetailsAdapter extends RecyclerView.Adapter<LeaveApplicationDetailsAdapter.LeaveApplicationDetailsViewHolder> {

    static OnItemButtonClicklistener mListener;
    List<LeaveApplicationDetails> mDataSet;
    Context mContext;
    LogInResponse logInResponse;

    public LeaveApplicationDetailsAdapter(Context mContext, List<LeaveApplicationDetails> mDataSet, OnItemButtonClicklistener listenter) {
        this.mDataSet = mDataSet;
        this.mContext = mContext;
        this.mListener = listenter;
        getUserCategory();
    }

    private void getUserCategory() {
        logInResponse = SaveUserInformationUtil.getUserInfo(mContext);
    }

    @Override
    public LeaveApplicationDetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LeaveApplicationDetailsViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_leave_application_third_version, parent, false);
        viewHolder = new LeaveApplicationDetailsViewHolder(view, logInResponse);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(LeaveApplicationDetailsViewHolder holder, int position) {
        holder.bindData(mContext, mDataSet.get(position), position);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public void updateDataSet(List<LeaveApplicationDetails> newDataSet) {
        try {
            mDataSet = newDataSet;
            notifyDataSetChanged();
        } catch (Exception ex) {

        }
    }

    public interface OnItemButtonClicklistener {
        void onClick(View view, int position, String viewEdit);
    }

    public static class LeaveApplicationDetailsViewHolder extends RecyclerView.ViewHolder {


        /////////////************ Employee View *************////////////////
        @BindView(R.id.leaveApplicationEmployeeView)
        LinearLayout leaveApplicationEmployeeView;
        @BindView(R.id.txtApplyDate)
        TextView txtApplyDate;
        @BindView(R.id.statusImage)
        ImageView statusImage;
        @BindView(R.id.txtDayCount)
        TextView txtDayCount;
        @BindView(R.id.txtStatus)
        TextView txtStatus;
        @BindView(R.id.view_edit_btn)
        ImageView view_edit_btn;
        @BindView(R.id.txtLeave)
        TextView txtLeave;
        @BindView(R.id.txtDayCountDate)
        TextView txtDayCountDate;
        @BindView(R.id.txtLeavePurpose)
        TextView txtLeavePurpose;
        @BindView(R.id.imgLeftBar)
        ImageView imgLeftBar;
        /////////////************ Employee View *************////////////////

        ////////////************* Admin View ***************////////////////

        @BindView(R.id.leaveApplicationAdminView)
        LinearLayout leaveApplicationAdminView;
        @BindView(R.id.txtApplyDateAdmin)
        TextView txtApplyDateAdmin;
        @BindView(R.id.statusImageAdmin)
        ImageView statusImageAdmin;
        @BindView(R.id.txtDayCountAdmin)
        TextView txtDayCountAdmin;
        @BindView(R.id.txtStatusAdmin)
        TextView txtStatusAdmin;
        @BindView(R.id.view_edit_btn_admin)
        ImageView view_edit_btn_admin;
        @BindView(R.id.txtLeaveAdmin)
        TextView txtLeaveAdmin;
        @BindView(R.id.txtLeavePurposeAdmin)
        TextView txtLeavePurposeAdmin;
        @BindView(R.id.imgLeftBarAdmin)
        ImageView imgLeftBarAdmin;
        @BindView(R.id.profileImage)
        ImageView profileImage;
        @BindView(R.id.txtEmployeeName)
        TextView txtEmployeeName;

        ////////////************* Admin View ***************////////////////


        private LogInResponse logInResponse;

        public LeaveApplicationDetailsViewHolder(View itemView, LogInResponse logInResponse) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            if (logInResponse != null) {
                this.logInResponse = logInResponse;
                if (logInResponse.getUserCategory() != null) {
                    if (logInResponse.getUserCategory().equalsIgnoreCase("admin")) {
                        leaveApplicationAdminView.setVisibility(View.VISIBLE);
                        leaveApplicationEmployeeView.setVisibility(View.GONE);
                    } else {
                        leaveApplicationEmployeeView.setVisibility(View.VISIBLE);
                        leaveApplicationAdminView.setVisibility(View.GONE);
                    }
                }
            }

        }

        public void bindData(final Context context, final LeaveApplicationDetails leaveApplicationDetails, final int position) {

            try {
                if (logInResponse != null) {
                    if (logInResponse.getUserCategory() != null) {
                        if (logInResponse.getUserCategory().equalsIgnoreCase("admin")) {

                            setDataForAdminView(context, leaveApplicationDetails, position);

                        } else {
                            setDataForEmployeeView(context, leaveApplicationDetails, position);
                        }
                    }
                }
            } catch (Exception ex) {

            }


        }

        private void setDataForEmployeeView(final Context context, final LeaveApplicationDetails leaveApplicationDetails, final int position) {
            if (leaveApplicationDetails != null) {

                if (leaveApplicationDetails.getApplyDateString() != null) {
                    txtApplyDate.setText(leaveApplicationDetails.getApplyDateString() + "(Apply Date)");
                }

                if (leaveApplicationDetails.getFromDateString() != null && leaveApplicationDetails.getToDateString() != null
                        && leaveApplicationDetails.getLeaveName() != null) {

                    txtLeave.setText(("From " + leaveApplicationDetails.getFromDateString() + " to " + leaveApplicationDetails.getToDateString()
                    ));
                }

                if (leaveApplicationDetails.getDayCount() != null) {
                    txtDayCount.setText(String.valueOf(leaveApplicationDetails.getDayCount()));
                }

                if (leaveApplicationDetails.getNotes() != null) {
                    if (leaveApplicationDetails.getNotes().length() > 22) {
                        txtLeavePurpose.setText(processString(leaveApplicationDetails.getNotes()));
                    } else {
                        txtLeavePurpose.setText(leaveApplicationDetails.getNotes());
                    }

                }

                if (leaveApplicationDetails.getLeaveName() != null) {

                    try {
                        if (leaveApplicationDetails.getLeaveName().contains("Leave")) {

                            String leaveName = leaveApplicationDetails.getLeaveName();
                            // To cover the case
                            // if the word is at the
                            // beginning of the string
                            // or anywhere in the middle
                            String tempWord = "Leave" + " ";
                            leaveName = leaveName.replaceAll(tempWord, "");

                            // To cover the edge case
                            // if the word is at the
                            // end of the string
                            tempWord = " " + "Leave";
                            leaveName = leaveName.replaceAll(tempWord, "");
                            txtDayCountDate.setText(leaveName);
                        } else {
                            txtDayCountDate.setText(leaveApplicationDetails.getLeaveName());
                        }
                    } catch (Exception ex) {

                    }

                }

              /*if(leaveApplicationDetails.getLeaveName() != null){
                    txtDayCountDate.setText(leaveApplicationDetails.getLeaveName());
              }*/

                if (leaveApplicationDetails.getLeaveStatus() != null) {

                   /* if (leaveApplicationDetails.getLeaveStatus().equalsIgnoreCase(LeaveStatus.APPROVED.getKey())) {
                        statusImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.approved_right));
                        txtStatus.setText("#" + LeaveStatus.APPROVED.getValue());
                        txtStatus.setTextColor(ContextCompat.getColor(context, R.color.leave_approve_text_color));
                        imgLeftBar.setBackgroundColor(ContextCompat.getColor(context, R.color.leave_approve_text_color));
                    } else if (leaveApplicationDetails.getLeaveStatus().equalsIgnoreCase(LeaveStatus.REJECTED.getKey())) {
                        statusImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.rejected_status));
                        txtStatus.setText("#" + LeaveStatus.REJECTED.getValue());
                        txtStatus.setTextColor(ContextCompat.getColor(context, R.color.leave_rejected_text_color));
                        imgLeftBar.setBackgroundColor(ContextCompat.getColor(context, R.color.leave_rejected_text_color));
                    } else if (leaveApplicationDetails.getLeaveStatus().equalsIgnoreCase(LeaveStatus.PENDING.getKey())) {
                        statusImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.pending_status));
                        txtStatus.setText("#" + LeaveStatus.PENDING.getValue());
                        txtStatus.setTextColor(ContextCompat.getColor(context, R.color.leave_pending_text_color));
                        imgLeftBar.setBackgroundColor(ContextCompat.getColor(context, R.color.leave_pending_text_color));
                    }*/
                }

                view_edit_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (leaveApplicationDetails.getNotUpdatable() != null) {
                            if (leaveApplicationDetails.getNotUpdatable()) {
                                mListener.onClick(v, position, context.getString(R.string.requisiion_view_btn));
                            } else {
                                mListener.onClick(v, position, context.getString(R.string.requisiion_edit_btn));

                            }
                        }


                    }
                });

            }
        }

        private void setDataForAdminView(final Context context, final LeaveApplicationDetails leaveApplicationDetails, final int position) {

            if (leaveApplicationDetails != null) {

                if (leaveApplicationDetails.getEmployeeName() != null) {
                    txtEmployeeName.setText(leaveApplicationDetails.getEmployeeName());
                }

                if (leaveApplicationDetails.getDayCount() != null) {
                    if (leaveApplicationDetails.getDayCount() > 1) {
                        txtDayCountAdmin.setText(String.valueOf(leaveApplicationDetails.getDayCount()) + " days");
                    } else {
                        txtDayCountAdmin.setText(String.valueOf(leaveApplicationDetails.getDayCount()) + " day");
                    }
                }

                if (leaveApplicationDetails.getFromDateString() != null && leaveApplicationDetails.getToDateString() != null) {

                    txtLeaveAdmin.setText(("From " + leaveApplicationDetails.getFromDateString() + " to " + leaveApplicationDetails.getToDateString()));
                }

                if (leaveApplicationDetails.getNotes() != null) {

                    if (leaveApplicationDetails.getNotes().length() > 22) {
                        txtLeavePurposeAdmin.setText(processString(leaveApplicationDetails.getNotes()));
                    } else {
                        txtLeavePurposeAdmin.setText(leaveApplicationDetails.getNotes());
                    }
                }

                if (leaveApplicationDetails.getApplyDateString() != null) {
                    txtApplyDateAdmin.setText(leaveApplicationDetails.getApplyDateString() + "(Apply Date)");
                }


                /*if (leaveApplicationDetails.getLeaveStatus() != null) {

                    if (leaveApplicationDetails.getLeaveStatus().equalsIgnoreCase(LeaveStatus.APPROVED.getKey())) {
                        statusImageAdmin.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.approved_right));
                        txtStatusAdmin.setText("#" + LeaveStatus.APPROVED.getValue());
                        txtStatusAdmin.setTextColor(ContextCompat.getColor(context, R.color.leave_approve_text_color));
                        imgLeftBarAdmin.setBackgroundColor(ContextCompat.getColor(context, R.color.leave_approve_text_color));
                    } else if (leaveApplicationDetails.getLeaveStatus().equalsIgnoreCase(LeaveStatus.REJECTED.getKey())) {
                        statusImageAdmin.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.rejected_status));
                        txtStatusAdmin.setText("#" + LeaveStatus.REJECTED.getValue());
                        txtStatusAdmin.setTextColor(ContextCompat.getColor(context, R.color.leave_rejected_text_color));
                        imgLeftBarAdmin.setBackgroundColor(ContextCompat.getColor(context, R.color.leave_rejected_text_color));
                    } else if (leaveApplicationDetails.getLeaveStatus().equalsIgnoreCase(LeaveStatus.PENDING.getKey())) {
                        statusImageAdmin.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.pending_status));
                        txtStatusAdmin.setText("#" + LeaveStatus.PENDING.getValue());
                        txtStatusAdmin.setTextColor(ContextCompat.getColor(context, R.color.leave_pending_text_color));
                        imgLeftBarAdmin.setBackgroundColor(ContextCompat.getColor(context, R.color.leave_pending_text_color));
                    }
                }*/

                view_edit_btn_admin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (leaveApplicationDetails.getNotUpdatable() != null) {
                            if (leaveApplicationDetails.getNotUpdatable()) {
                                mListener.onClick(v, position, context.getString(R.string.requisiion_view_btn));
                            } else {
                                mListener.onClick(v, position, context.getString(R.string.requisiion_edit_btn));

                            }
                        }


                    }
                });


            }
        }


        private String processString(String inputStr) {

            try {
                String processedString = inputStr.substring(0, 22) + "..";
                return processedString;
            } catch (Exception ex) {
                return "";
            }

        }

    }
}

