private void calculateRealmView() {
    // calculating rows and margin, then updating the layout to scroll
    try {
        if(realmRecyclerView != null && itemsRealmAdapter != null) {
            int totalItemsCount = itemsRealmAdapter.getItemCount();
            if (totalItemsCount > 0 && totalItemsCount != totalItemsCountLastChecked) {
                if (realmRecyclerView.getRecycleView().getChildAt(0) != null) {
                    int itemHeight = realmRecyclerView.getRecycleView().getChildAt(0).getHeight();
                    if(itemHeight == 0) itemHeight = 200;
                    int floatingButtonHeight = floatingActionMenu.getChildAt(0).getHeight();
                    if(floatingButtonHeight == 0) floatingButtonHeight = 108;
                    int numberOfRows = (int) Math.ceil(((float) totalItemsCount) / 3);
                    int containerHeightWithoutMargin = numberOfRows * (itemHeight + 8);
                    if (totalItemsCount % 3 == 0) {
                        containerHeightWithoutMargin = containerHeightWithoutMargin + (floatingButtonHeight*2);
                    }

                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, containerHeightWithoutMargin);
                    layoutParams.addRule(RelativeLayout.BELOW, R.id.content_attachmentItemOverview_relativeLayout_content);
                    realmRecyclerView.setLayoutParams(layoutParams);
                    realmRecyclerView.invalidate();

                    totalItemsCountLastChecked = totalItemsCount;
                }else{
                    resetRealmView();
                }
            }
        }
    } catch (Exception e) {
        Global.logThis(TAG, "calculateRealmView Exception", e);
        resetRealmView();
    }
}
