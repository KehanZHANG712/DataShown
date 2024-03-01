<template>
 <div>
  <el-table
    :data="tableData.filter(data => !search || data.cohortTitle.toLowerCase().includes(search.toLowerCase()))"
    style="width: 100%">
    <el-table-column type="expand">
      <template slot-scope="props">
        <el-form label-position="left" inline class="demo-table-expand">
          <el-form-item label="Cohort Id">
            <span>{{ props.row.cohortId }}</span>
          </el-form-item>
          <el-form-item label="Cohort Title">
            <span>{{ props.row.cohortTitle }}</span>
          </el-form-item>
          <el-form-item label="Cohort Tag">
            <span>{{ props.row.cohortTags }}</span>
          </el-form-item>
          <el-form-item label="Cohort Source">
            <span>{{ props.row.cohortSource}}</span>
          </el-form-item>
          <el-form-item label="Cohort WebLink">
            <el-link type="primary" @click="jump2(props.row.cohortWebLink)">{{ props.row.cohortWebLink }}</el-link>
          </el-form-item>
          <el-form-item label="Cohort Funding">
            <span>{{ props.row.cohortFunding }}</span>
          </el-form-item>
          <el-form-item label="Cohort Key Publication">
            <span>{{ props.row.cohortKeyPublication }}</span>
          </el-form-item>
          <el-form-item label="Cohort Start year">
            <span>{{ props.row.cohortStartyear }}</span>
          </el-form-item>
          <el-form-item label="Cohort Recent year">
            <span>{{ props.row.cohortRecentyear}}</span>
          </el-form-item>
        </el-form>
      </template>
    </el-table-column>
    <el-table-column
      label="Cohort ID"
      prop="cohortId"
      width="100px" >
    </el-table-column>
    <el-table-column
      label="Cohort Title"
      prop="cohortTitle">
    </el-table-column>
    <el-table-column
      label="Cohort Tags"
      prop="cohortTags">
    </el-table-column>
     <el-table-column
      label="Cohort Participants"
      prop="cohortParticipants"
      width="180px"
      sortable>
    </el-table-column>
    <el-table-column
      label="Data"
      width="180px">
      <template slot-scope="props">
         <el-button
        prop="bt"
          size="mini"
          @click="handleEdit(props.row)">
          Data Visualization</el-button>
      </template>
    </el-table-column>
     <el-table-column
      align="right">
      <template slot="header" slot-scope="scope">
        <el-input
          v-model="search"
          size="mini"
          placeholder="Search by keywords"/>
      </template>
     </el-table-column>
  </el-table>
 <el-dialog title="PieCharts for Data" :visible.sync="dialogTableVisible"   @open="open()">
  <div class="dialogDiv">
  <div class="echart" id="mychart" :style="myChartStyle"></div>
  <div class="echart1" id="mychart1" :style="myChartStyle"></div>
   </div>
</el-dialog>
  </div>
</template>

<style>
.dialogDiv {
        height: 500px;
        overflow: auto;
    }
  .demo-table-expand {
    font-size: 0;
  }
  .demo-table-expand label {
    width: 190px;
    color: #446696;
  }
  .demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 90%;
  }
</style>

<script>
import * as echarts from "echarts"
import { deepClone } from '@/utils'
  export default {
        created(){
        this.$axios.get("http://localhost:8080/re/cohort/selectAllCohort").then(res => {
        console.log(res.data)
        this.tableData = res.data
      })
      },
      mounted() {
    this.initDate(); 
    this.initEcharts();
    this.initData(); 
    this.initEcharts1();
  },
    data() {
      return {
        myChart: {},
        myChart1: {},
      pieData: [
        {
          value: '',
          name: 'Male'
        },
        {
          value: '',
          name: 'Female'
        }
      ],
        pieData1: [
        {
          value: '',
          name: 'under 20'
        },
        {
          value: '',
          name: '20~39'
        },
        {
          value: '',
          name: '40~59'
        },
        {
          value: '',
          name: 'over 60'
        }
      ],
       pieName: [],
       pieName9: [],
      myChartStyle: { float: "left", width: "100%", height: "400px" },
        dialogTableVisible: false,
        search: '',
       tableData: [{
          cohortId: '',
          cohortTitle: '',
          cohortTags: '',
          cohortContent: '',
          cohortWebLink: '',
          cohortFunding: '',
          cohortKeyPublication: '',
          cohortSource: '',
          cohortStartyear: '',
          cohortRecentyear: '',
          cohortParticipants: '',
          cohortMparticipants: '',
          cohort20: '',
          cohort2039: '',
          cohort4059: '',
          cohort60: '',
          }],
      }
    },
      methods: {
        jump2(e){
        window.location.href=e
        },
         open(){
        this.$nextTick(() => {
        //  执行echarts方法
          this.initEcharts(),
          this.initEcharts1()
        })
      },
    initDate() {
      for (let i = 0; i < this.pieData.length; i++) {
        // this.xData[i] = i;
        // this.yData =this.xData[i]*this.xData[i];
        this.pieName[i] = this.pieData[i].name;
      }
      for (let a = 0; a < this.pieData1.length; a++) {
        // this.xData[i] = i;
        // this.yData =this.xData[i]*this.xData[i];
        this.pieName9[a] = this.pieData1[a].name;
      }
    },
    initData() {
      for (let a = 0; a < this.pieData1.length; a++) {
        // this.xData[i] = i;
        // this.yData =this.xData[i]*this.xData[i];
        this.pieName9[a] = this.pieData1[a].name;
      }
    },
    initEcharts() {
      // 饼图
      const option = {
        legend: {
          // 图例
          data: this.pieName,
          right: "10%",
          top: "30%",
          orient: "vertical"
        },
        title: {
          // 设置饼图标题，位置设为顶部居中
          text: "Compare by Gender",
          top: "0%",
          left: "center"
        },
        series: [
          {
            type: "pie",
            label: {
              show: true,
              formatter: "{b} : {c} ({d}%)" // b代表名称，c代表对应值，d代表百分比
            },
            radius: "30%", //饼图半径
            data: this.pieData
          }
        ]
      };
      console.log(this.seriesData);
      const optionFree = {
        xAxis: {},
        yAxis: {},
        series: [
          {
            data: this.seriesData,
            type: "line",
            smooth: true
          }
        ]
      };
      this.myChart = echarts.init(document.getElementById("mychart"));
      this.myChart.setOption(option);
      //随着屏幕大小调节图表
      window.addEventListener("resize", () => {
        this.myChart.resize();
      });
    },
     initEcharts1() {
      // 饼图
      const option1 = {
        legend: {
          data: this.pieName9,
          right: "10%",
          top: "30%",
          orient: "vertical"
        },
        title: {
          // 设置饼图标题，位置设为顶部居中
          text: "Compare by age",
          top: "0%",
          left: "center"
        },
        series: [
          {
            type: "pie",
            label: {
              show: true,
              formatter: "{b} : {c} ({d}%)" // b代表名称，c代表对应值，d代表百分比
            },
            radius: "30%", //饼图半径
            data: this.pieData1
          }
        ]
      };
      console.log(this.seriesData);
      const optionFree = {
        xAxis: {},
        yAxis: {},
        series: [
          {
            data: this.seriesData,
            type: "line",
            smooth: true
          }
        ]
      };
      this.myChart1 = echarts.init(document.getElementById("mychart1"));
      this.myChart1.setOption(option1);
      //随着屏幕大小调节图表
      window.addEventListener("resize", () => {
        this.myChart1.resize();
      });
    },
    handleEdit(e){
    this.dialogTableVisible=true
    this.$axios.get("http://localhost:8080/re/cohort/selectAllCohort").then(res => {
        if (e.cohortMparticipants!=''&& e.cohortFparticipants!=''){
        this.pieData[0].value= e.cohortMparticipants
        this.pieData[1].value= e.cohortFparticipants
        this.pieData1[0].value= e.cohort20
        this.pieData1[1].value= e.cohort2039
        this.pieData1[2].value= e.cohort4059
        this.pieData1[3].value= e.cohort60
        };
        console.log(this.pieName)
        //if(this.pieData.name=='female'){
       // this.pieData.value=e.cohortFparticipants
        //}
      })
    }
  }
  }
</script>