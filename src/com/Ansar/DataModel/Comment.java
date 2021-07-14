package com.Ansar.DataModel;


public class Comment extends ProfessionalDetails{

  private int commentId;
  private String commentDetails;
  private int paymentId;
  // private int customerId; //This

  /**
   * @param commentId
   * @param commentDetails
   * @param paymentId
   * @param customerId
   */
  public Comment(int commentId, String commentDetails, int paymentId,int customerId) {
    super(customerId);
    this.commentId = commentId;
    this.commentDetails = commentDetails;
    this.paymentId = paymentId;
  }

  //Getters & Setters---------------------------------------------------------------------------------------------------
  public int getCommentId() { return commentId; }
  public void setCommentId(int commentId) { this.commentId = commentId; }
  public String getCommentDetails() { return commentDetails; }
  public void setCommentDetails(String commentDetails) { this.commentDetails = commentDetails; }
  public int getPaymentId() { return paymentId; }
  public void setPaymentId(int paymentId) { this.paymentId = paymentId; }
  //====================================================================================================================
}
