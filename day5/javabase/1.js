//对象的创建方式 有两种
//1字面量
var obj={};

//2  构造函数
var obj1=new Object();


//创建数组的方法两种
var arr=[];

var arr1=new Array(10).fill(4);
console.log(arr1)


//创造函数的方法有两种
function demo(){

}

var demo1=function(){

}

var demo2=new Function()

// 构造函数
//1 工厂模式  优点  批量制作对象  缺点 无法分清具体那个
// function Person(age,name,sex){
//     var obj={};
//     obj.age=age;
//     obj.name=name;
//     obj.sex=sex;
//     return obj;
// }

// var p1=new Person(12,'小红','男')
// var p2=new Person(12,'小李','男')
// console.log(p1===p2);
// console.log(p1,p2)


// 构造函数解决简单工厂缺陷 无法区分种类
function Person(age,name,sex){
    this.age=age;
    this.sex=sex;
    this.name=name;
}
var p1=new Person(12,'小红','男')
var p2=new Person(12,'小李','男')
console.log(p1===p2);
console.log(p1,p2)
