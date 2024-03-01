<template>
<div>
  <el-dialog
  title="Add new cohort"
  :visible.sync="dialogVisible"
  width="50%"
  :before-close="handleClose">
<el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="200px" class="demo-ruleForm">
  <el-form-item label="Cohort Title" prop="cohortTitle">
    <el-input v-model="ruleForm.cohortTitle"></el-input>
  </el-form-item>
    <el-form-item label="Cohort Tag" prop="cohortTags">
    <el-input v-model="ruleForm.cohortTags"></el-input>
  </el-form-item>
      <el-form-item label="Cohort Weblink" prop="cohortWenlink">
    <el-input v-model="ruleForm.cohortWebLink"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Introduction" prop="cohortIntroducton">
    <el-input type="textarea" v-model="ruleForm.cohortIntroducton"></el-input>
  </el-form-item>
   <el-form-item label="Cohort Owner" prop="cohortIntroducton">
    <el-input type="textarea" v-model="ruleForm.cohortOwner"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm('ruleForm')">Submit</el-button>
    <el-button @click="resetForm('ruleForm')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible = false">Cancel</el-button>
  </span>
</el-dialog>
<el-dialog
  title="Edit cohort"
  :visible.sync="dialogVisible0"
  width="50%">
<el-form :model="ruleForm0" :rules="rules" ref="ruleForm0" label-width="200px" class="demo-ruleForm">
  <el-form-item label="Cohort Title" prop="cohortTitle">
    <el-input v-model="ruleForm0.cohortTitle"></el-input>
  </el-form-item>
    <el-form-item label="Cohort Tag" prop="cohortTags">
    <el-input v-model="ruleForm0.cohortTags"></el-input>
  </el-form-item>
      <el-form-item label="Cohort Weblink" prop="cohortWenlink">
    <el-input v-model="ruleForm0.cohortWebLink"></el-input>
  </el-form-item>
      <el-form-item label="Cohort Funding" prop="cohortFunding">
    <el-input v-model="ruleForm0.cohortFunding"></el-input>
  </el-form-item>
        <el-form-item label="Cohort Key Publication" prop="cohortKeyPublication">
    <el-input v-model="ruleForm0.cohortKeyPublication"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Introduction" prop="cohortIntroducton">
    <el-input type="textarea" v-model="ruleForm0.cohortIntroducton"></el-input>
  </el-form-item>
   <el-form-item label="Cohort Owner" prop="cohortIntroducton">
    <el-input v-model="ruleForm0.cohortOwner"></el-input>
  </el-form-item>
   <el-form-item label="Cohort Participants" prop="cohortParticipants">
    <el-input v-model="ruleForm0.cohortParticipants"></el-input>
  </el-form-item>
    <el-form-item label="Cohort Male Participants" prop="cohortMparticipants">
    <el-input v-model="ruleForm0.cohortMparticipants"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Female Participants" prop="cohortFparticipants">
    <el-input  v-model="ruleForm0.cohortFparticipants"></el-input>
  </el-form-item>
   <el-form-item label="Participants under 20" prop="cohort20">
    <el-input  v-model="ruleForm0.cohort20"></el-input>
  </el-form-item>
     <el-form-item label="Participants between 20~39" prop="cohort2039">
    <el-input  v-model="ruleForm0.cohort2039"></el-input>
  </el-form-item>
   <el-form-item label="Participants between 40~59" prop="cohort4059">
    <el-input  v-model="ruleForm0.cohort4059"></el-input>
  </el-form-item>
   <el-form-item label="Participants over 60" prop="cohort60">
    <el-input  v-model="ruleForm0.cohort60"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Source" prop="cohortSource">
    <el-input v-model="ruleForm0.cohortSource"></el-input>
  </el-form-item>
   <el-form-item label="Cohort Start Year" prop="cohortStartyear">
    <el-input v-model="ruleForm0.cohortStartyear"></el-input>
  </el-form-item>
  <el-form-item label="Cohort Recent Year" prop="cohortRecentyear">
    <el-input v-model="ruleForm0.cohortRecentyear"></el-input>
  </el-form-item>
    <el-form-item label="Average_Years_Follow_Up" prop="cohortAvayears">
    <el-input v-model="ruleForm0.cohortAvayears"></el-input>
  </el-form-item>
  <el-form-item label="Number_Follow_Ups" prop="cohortNumfollow">
    <el-input v-model="ruleForm0.cohortNumfollow"></el-input>
  </el-form-item>
   <el-form-item label="Withdrawn participants" prop="cohortWithdraw">
    <el-input v-model="ruleForm0.cohortWithdraw"></el-input>
  </el-form-item>
   <el-form-item label="Lost participants" prop="cohortLost">
    <el-input v-model="ruleForm0.cohortLost"></el-input>
  </el-form-item>
     <el-form-item label="Deceased participants" prop="cohortDecrease">
    <el-input v-model="ruleForm0.cohortDecrease"></el-input>
  </el-form-item>
       <el-form-item label="Completed participants" prop="cohortComplete">
    <el-input v-model="ruleForm0.cohortComplete"></el-input>
  </el-form-item>
     <el-form-item label="Timephase" prop="cohortTimephase">
    <el-input v-model="ruleForm0.cohortTimephase"></el-input>
  </el-form-item>
    <el-form-item label="Anthropometrics" prop="cohortAnthropometrics">
    <el-input v-model="ruleForm0.cohortAnthropometrics"></el-input>
  </el-form-item>
  <el-form-item label="Lifestyle" prop="cohortLifestyle">
    <el-select v-model="ruleForm0.cohortLifestyle" placeholder="Choose a liftstyle">
      <el-option label="Nutrition" value="Nutrition"></el-option>
      <el-option label="Physical activty" value="Physical activty"></el-option>
      <el-option label="Smoking" value="Smoking"></el-option>
      <el-option label="Sun exposure" value="Sun exposure"></el-option>
    </el-select>
  </el-form-item>
    <el-form-item label="Health" prop="cohortHealth">
    <el-input v-model="ruleForm0.cohortHealth"></el-input>
  </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="submitForm0('ruleForm0')">Submit</el-button>
    <el-button @click="resetForm('ruleForm')">Reset</el-button>
  </el-form-item>
</el-form>
  <span slot="footer" class="dialog-footer">
    <el-button @click="dialogVisible = false">Cancel</el-button>
  </span>
</el-dialog>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      label="Cohort Id"
      prop="cohortId"
      width="100">
      <template slot-scope="scope">
        <span style="margin-left: 10px">{{ scope.row.cohortId }}</span>
      </template>
    </el-table-column>
    <el-table-column
      label="Cohort Title"
      width="880"
      prop="cohortTitle">
      <template slot-scope="scope">
        <el-popover trigger="hover" placement="top">
          <p>Tags: {{ scope.row.cohortTags }}</p>
          <p>Introduction: {{ scope.row.cohortIntroducton }}</p>
          <div slot="reference" class="name-wrapper">
            <el-tag size="medium">{{ scope.row.cohortTitle }}</el-tag>
          </div>
        </el-popover>
      </template>
    </el-table-column>
    <el-table-column label="Actions">
      <template slot-scope="scope">
        <el-button
          size="mini"
          @click="handleEdit(scope.row)">Edit</el-button>
        <el-button
          size="mini"
          type="danger"
          @click="handleDelete(scope.row)">Delete</el-button>
      </template>
    </el-table-column>
    <el-table-column
      align="right">
      <template slot="header" slot-scope="scope">
      <el-button @click="dialogVisible = true" type="primary" >Create cohort<i class="el-icon-circle-plus-outline"></i></el-button>
      </template>
    </el-table-column>
  </el-table>

</div>
</template>

<script>
import { deepClone } from '@/utils'
  export default {
       created(){
        this.$axios.get("http://localhost:8080/re/cohort/selectAllCohort").then(res => {
        console.log(res.data)
        this.tableData = res.data
      })
      },
    data() {
      return {
        rules: {
          cohortTitle: [
            { required: true, message: 'please input cohort title', trigger: 'blur' },
            { min: 0, max: 99, message: 'length between 0 to 99', trigger: 'blur' }
          ],},
        dialogVisible: false,
        dialogVisible0: false,
        ruleForm: {
          cohortIntroducton: '',
          cohortTitle: '',
          cohortTags: '',
          cohortWebLink: '',
          cohortOwner: '',
        },
        ruleForm0: {
          cohortIntroducton: '',
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
          cohortOwner: '',
          cohortMparticipants: '',
        },
        tableData: [{
          cohortIntroducton: '',
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
          cohortOwner: '',
          cohortMparticipants: '',
        }]
      }
    },
    methods: {
      submitForm(ruleForm) {
        console.log(this.ruleForm.cohortTitle)
        this.$axios.post("http://localhost:8080/re/cohort/insertCohort",{
          cohortTitle: this.ruleForm.cohortTitle,
          cohortIntroducton: this.ruleForm.cohortIntroducton,
          cohortTags: this.ruleForm.cohortTags,
          cohortOwner: this.ruleForm.cohortOwner,
        }) 
       },
           submitForm0(ruleForm0) {
            console.log(this.ruleForm0)
        this.$axios.post("http://localhost:8080/re/cohort/updateCohort",{
          cohortTitle: this.ruleForm0.cohortTitle,
          cohortIntroducton: this.ruleForm0.cohortIntroducton,
          cohortTags: this.ruleForm0.cohortTags,
          cohortOwner: this.ruleForm0.cohortOwner,
          cohortId: this.ruleForm0.cohortId,
          cohortWebLink: this.ruleForm0.cohortWebLink,
          cohortMparticipants: this.ruleForm0.cohortMparticipants,
          cohortFparticipants: this.ruleForm0.cohortFparticipants,
          cohortParticipants: this.ruleForm0.cohortParticipants,
          cohortMean: this.ruleForm0.cohortMean,
          cohort20: this.ruleForm0.cohort20,
          cohort2039: this.ruleForm0.cohort2039,
          cohort4059: this.ruleForm0.cohort4059,
          cohort60: this.ruleForm0.cohort60,
          cohortSource: this.ruleForm0.cohortSource,
          cohortStartyear :this.ruleForm0.cohortStartyear,
          cohortRecentyear :this.ruleForm0.cohortRecentyear,
          cohortNumfollow :this.ruleForm0.cohortNumfollow,
          cohortAvayears :this.ruleForm0.cohortAvayears,
          cohortWithdraw :this.ruleForm0.cohortWithdraw,
          cohortLost :this.ruleForm0.cohortLost,
          cohortDecrease :this.ruleForm0.cohortDecrease,
          cohortComplete :this.ruleForm0.cohortComplete,
          cohortTimephase: this.ruleForm0.cohortTimephase,
          cohortAnthropometrics : this.ruleForm0.cohortAnthropometrics,
          cohortLifestyle :this.ruleForm0.cohortLifestyle,
          cohortHealth :this.ruleForm0.cohortHealth,
          cohortFunding : this.ruleForm0.cohortFunding,
          cohortKeyPublication : this.ruleForm0.cohortKeyPublication,
        }) 
        location.reload()
       },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      
    },
      handleEdit(e) {
        this.dialogVisible0=true
        this.ruleForm0 = deepClone(e)
      },
      handleDelete (e) {
      alert(JSON.stringify(e))
      alert(e.cohortId)
      this.$confirm('This operation will permanently delete the user information. Continue?', 'alert', {
        confirmButtonText: 'submit',
        cancleButtonText: 'cancel',
        type: 'warning'
      }).then(() => {
        this.$axios.post("http://localhost:8080/re/cohort/deleteCohort", {cohortId: e.cohortId})
          .then(alert('success'),
            location.reload()
          )
      })
},
    }
  }
</script>