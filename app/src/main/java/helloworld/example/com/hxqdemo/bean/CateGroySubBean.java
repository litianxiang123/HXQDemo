package helloworld.example.com.hxqdemo.bean;

import java.util.List;

/**
 * Created by 李天祥 on 2018/3/21.
 */

public class CateGroySubBean {

    /**
     * message : 成功
     * res_code : 1
     * result : [{"aliCategoryId":"0","categoryId":19,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/jtys.jpg","level":2,"name":"街头原宿","parentId":2,"parentTree":"0_2","position":1,"updateTime":1521453051000},{"aliCategoryId":"0","categoryId":20,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/kz.jpg","level":2,"name":"裤装","parentId":2,"parentTree":"0_2","position":2,"updateTime":1521453226000},{"aliCategoryId":"0","categoryId":21,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/ms.jpg","level":2,"name":"毛衫","parentId":2,"parentTree":"0_2","position":3,"updateTime":1521453487000},{"aliCategoryId":"0","categoryId":22,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/nd.jpg","level":2,"name":"内搭","parentId":2,"parentTree":"0_2","position":4,"updateTime":1521453539000},{"aliCategoryId":"0","categoryId":23,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/qz.jpg","level":2,"name":"裙装","parentId":2,"parentTree":"0_2","position":5,"updateTime":1521453625000},{"aliCategoryId":"0","categoryId":24,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/sxtz.jpg","level":2,"name":"时尚套装","parentId":2,"parentTree":"0_2","position":6,"updateTime":1521453798000},{"aliCategoryId":"0","categoryId":25,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/wt.jpg","level":2,"name":"外套","parentId":2,"parentTree":"0_2","position":7,"updateTime":1521453864000},{"aliCategoryId":"0","categoryId":26,"categoryStatus":1,"categoryType":0,"gender":0,"imgUrl":"http://image.huoli666.com/category/wy.jpg","level":2,"name":"卫衣","parentId":2,"parentTree":"0_2","position":8,"updateTime":1521453910000}]
     * systemTime : 1521610977
     */

    private String message;
    private int res_code;
    private String systemTime;
    private List<ResultBean> result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRes_code() {
        return res_code;
    }

    public void setRes_code(int res_code) {
        this.res_code = res_code;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * aliCategoryId : 0
         * categoryId : 19
         * categoryStatus : 1
         * categoryType : 0
         * gender : 0
         * imgUrl : http://image.huoli666.com/category/jtys.jpg
         * level : 2
         * name : 街头原宿
         * parentId : 2
         * parentTree : 0_2
         * position : 1
         * updateTime : 1521453051000
         */

        private String aliCategoryId;
        private int categoryId;
        private int categoryStatus;
        private int categoryType;
        private int gender;
        private String imgUrl;
        private int level;
        private String name;
        private int parentId;
        private String parentTree;
        private int position;
        private long updateTime;

        public String getAliCategoryId() {
            return aliCategoryId;
        }

        public void setAliCategoryId(String aliCategoryId) {
            this.aliCategoryId = aliCategoryId;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public int getCategoryStatus() {
            return categoryStatus;
        }

        public void setCategoryStatus(int categoryStatus) {
            this.categoryStatus = categoryStatus;
        }

        public int getCategoryType() {
            return categoryType;
        }

        public void setCategoryType(int categoryType) {
            this.categoryType = categoryType;
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

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
    }
}
