package com.basis.java.gof23.iterator.demo;

/**
 * 具体聚合类。聚合类实现createIterator()方法，分别返回电视界面的聚合类和电影界面的聚合类。
 */
public class FileMenu implements TVMenu{

    static final int MAX_ITEMS = 5;

    private MenuItem[]  menuItems;

    int numberOfItem = 0;

    public FileMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
        addItem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
        addItem(3, "黑客帝国123", "不知道你能够看懂不???");
        addItem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
        addItem(5, "肖申克的救赎", "自由，幸福，离你有多远");
    }


    /**
     * 将电影角色添加到菜单项中去
     *
     * @param channe
     * @param name
     * @param descp
     */
    @Override
    public void addItem(int channe, String name, String descp) {
        MenuItem tvmenuiItem = new MenuItem(channe, name, descp);
        if(numberOfItem==MAX_ITEMS){
            System.out.println("不好意思，电影频道菜单满了");
        }else {
            menuItems[numberOfItem] = tvmenuiItem;
            numberOfItem++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new FileMenuIterator(menuItems);
    }
}
