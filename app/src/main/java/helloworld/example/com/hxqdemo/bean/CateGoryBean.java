package helloworld.example.com.hxqdemo.bean;

import java.util.List;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class CateGoryBean {

    /**
     * result : [{"categoryId":1,"categoryType":0,"name":"精选","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/jx.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":1,"categoryStatus":1,"updateTime":1521448819000},{"categoryId":2,"categoryType":0,"name":"女装","level":1,"parentId":0,"parentTree":"0_","gender":0,"imgUrl":"http://image.huoli666.com/category/nz.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":2,"categoryStatus":1,"updateTime":1521448920000},{"categoryId":3,"categoryType":0,"name":"男装","level":1,"parentId":0,"parentTree":"0_","gender":1,"imgUrl":"http://image.huoli666.com/category/nz_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":3,"categoryStatus":1,"updateTime":1521449012000},{"categoryId":4,"categoryType":0,"name":"母婴童装","level":1,"parentId":0,"parentTree":"0_","gender":0,"imgUrl":"http://image.huoli666.com/category/mytz.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":4,"categoryStatus":1,"updateTime":1521449081000},{"categoryId":5,"categoryType":0,"name":"美妆","level":1,"parentId":0,"parentTree":"0_","gender":0,"imgUrl":"http://image.huoli666.com/category/mz.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":5,"categoryStatus":1,"updateTime":1521449278000},{"categoryId":6,"categoryType":0,"name":"食品保健","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/spbj_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":6,"categoryStatus":1,"updateTime":1521449389000},{"categoryId":7,"categoryType":0,"name":"箱包配饰","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/xbps.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":7,"categoryStatus":1,"updateTime":1521449463000},{"categoryId":8,"categoryType":0,"name":"手机周边","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/sjzb.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":8,"categoryStatus":1,"updateTime":1521449531000},{"categoryId":9,"categoryType":0,"name":"女士护理","level":1,"parentId":0,"parentTree":"0_","gender":1,"imgUrl":"http://image.huoli666.com/category/nshl.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":9,"categoryStatus":1,"updateTime":1521449619000},{"categoryId":10,"categoryType":0,"name":"男鞋","level":1,"parentId":0,"parentTree":"0_","gender":1,"imgUrl":"http://image.huoli666.com/category/nx_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":10,"categoryStatus":1,"updateTime":1521449680000},{"categoryId":11,"categoryType":0,"name":"女鞋","level":1,"parentId":0,"parentTree":"0_","gender":0,"imgUrl":"http://image.huoli666.com/category/nx.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":11,"categoryStatus":1,"updateTime":1521449777000},{"categoryId":12,"categoryType":0,"name":"家用电器","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/jydq_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":12,"categoryStatus":1,"updateTime":1521449811000},{"categoryId":13,"categoryType":0,"name":"个人护理","level":1,"parentId":0,"parentTree":"0_","gender":1,"imgUrl":"http://image.huoli666.com/category/grhl_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":13,"categoryStatus":1,"updateTime":1521449868000},{"categoryId":14,"categoryType":0,"name":"内衣","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/ny.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":14,"categoryStatus":1,"updateTime":1521449987000},{"categoryId":15,"categoryType":0,"name":"居家","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/jj_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":15,"categoryStatus":1,"updateTime":1521450134000},{"categoryId":16,"categoryType":0,"name":"运动健身","level":1,"parentId":0,"parentTree":"0_","gender":1,"imgUrl":"http://image.huoli666.com/category/ydjs_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":16,"categoryStatus":1,"updateTime":1521450096000},{"categoryId":17,"categoryType":0,"name":"成人用品","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/cryp_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":17,"categoryStatus":1,"updateTime":1521450201000},{"categoryId":18,"categoryType":0,"name":"宠物","level":1,"parentId":0,"parentTree":"0_","gender":2,"imgUrl":"http://image.huoli666.com/category/cw_m.jpg","aliCategoryId":"0","aliCategoryName":null,"aliParentTree":null,"position":18,"categoryStatus":1,"updateTime":1521450234000}]
     * message : 成功
     * systemTime : 1521601114
     * res_code : 1
     */

    private String message;
    private String systemTime;
    private int res_code;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public int getRes_code() {
        return res_code;
    }

    public void setRes_code(int res_code) {
        this.res_code = res_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * categoryId : 1
         * categoryType : 0
         * name : 精选
         * level : 1
         * parentId : 0
         * parentTree : 0_
         * gender : 2
         * imgUrl : http://image.huoli666.com/category/jx.jpg
         * aliCategoryId : 0
         * aliCategoryName : null
         * aliParentTree : null
         * position : 1
         * categoryStatus : 1
         * updateTime : 1521448819000
         */

        private int categoryId;
        private int categoryType;
        private String name;
        private int level;
        private int parentId;
        private String parentTree;
        private int gender;
        private String imgUrl;
        private String aliCategoryId;
        private Object aliCategoryName;
        private Object aliParentTree;
        private int position;
        private int categoryStatus;
        private long updateTime;

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public int getCategoryType() {
            return categoryType;
        }

        public void setCategoryType(int categoryType) {
            this.categoryType = categoryType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public String getParentTree() {
            return parentTree;
        }

        public void setParentTree(String parentTree) {
            this.parentTree = parentTree;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getAliCategoryId() {
            return aliCategoryId;
        }

        public void setAliCategoryId(String aliCategoryId) {
            this.aliCategoryId = aliCategoryId;
        }

        public Object getAliCategoryName() {
            return aliCategoryName;
        }

        public void setAliCategoryName(Object aliCategoryName) {
            this.aliCategoryName = aliCategoryName;
        }

        public Object getAliParentTree() {
            return aliParentTree;
        }

        public void setAliParentTree(Object aliParentTree) {
            this.aliParentTree = aliParentTree;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getCategoryStatus() {
            return categoryStatus;
        }

        public void setCategoryStatus(int categoryStatus) {
            this.categoryStatus = categoryStatus;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
    }
}
