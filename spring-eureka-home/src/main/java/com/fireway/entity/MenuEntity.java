package com.fireway.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/8 11:09
 * @Description:
 */
public class MenuEntity {
    /**
     * id: '1',
     *             text: '系统管理',
     *             isParent: true,
     *             icon: 'el-icon-menu',
     *             url: '',
     *             enabled: true,
     *             children:
      */
    private String id;
    private String text;
    private Boolean parent;
    private String icon = "el-icon-menu";
    private String url;
    private Boolean enabled;
    private List<MenuEntity> children = new ArrayList<>(5);

    public MenuEntity() {
    }

    /**
     *
     * @param id
     * @param text
     * @param isParent
     * @param icon
     * @param url
     * @param enabled
     */
    public MenuEntity(String id, String text, Boolean parent, String icon, String url, Boolean enabled) {
        this.id = id;
        this.text = text;
        this.parent = parent;
        this.icon = icon;
        this.url = url;
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<MenuEntity> getChildren() {
        return children;
    }

    public void setChildren(List<MenuEntity> children) {
        this.children = children;
    }
}
