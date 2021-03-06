package com.github.l3nnartt;

import net.labymod.settings.SettingsCategory;

public class CategoryElement extends SettingsCategory {
  private String modTitle;
  
  public CategoryElement(String title) {
    super(title);
    this.modTitle = title;
  }
  
  public void setTitle(String title) {
    this.modTitle = title;
  }
  
  public String getTitle() {
    return this.modTitle;
  }
}