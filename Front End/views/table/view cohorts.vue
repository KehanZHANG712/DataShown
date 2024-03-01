<template>
  <el-table
    :data="tableData.filter(data => !search || data.cohortTitle.toLowerCase().includes(search.toLowerCase()))"
    style="width: 100%">
    <el-table-column type="expand">
      <template slot-scope="props">
        <el-form label-position="left" inline class="demo-table-expand">
          <el-form-item label="CohortId">
            <span>{{ props.row.cohortId }}</span>
          </el-form-item>
          <el-form-item label="CohortTitle">
            <span>{{ props.row.cohortTitle }}</span>
          </el-form-item>
          <el-form-item label="CohortTag">
            <span>{{ props.row.cohortTags }}</span>
          </el-form-item>
          <el-form-item label="CohortContent">
            <span>{{ props.row.cohortContent }}</span>
          </el-form-item>
          <el-form-item label="CohortWebLink">
            <span>{{ props.row.cohortWebLink }}</span>
          </el-form-item>
          <el-form-item label="CohortFunding">
            <span>{{ props.row.cohortFunding }}</span>
          </el-form-item>
          <el-form-item label="CohortKeyPublication">
            <span>{{ props.row.cohortKeyPublication }}</span>
          </el-form-item>
        </el-form>
      </template>
    </el-table-column>
    <el-table-column
      label="Cohort ID"
      prop="cohortId">
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
      align="right">
      <template slot="header" slot-scope="scope">
        <el-input
          v-model="search"
          size="mini"
          placeholder="Search by keywords"/>
      </template>
  </el-table>
</template>

<style>
  .demo-table-expand {
    font-size: 0;
  }
  .demo-table-expand label {
    width: 90px;
    color: #99a9bf;
  }
  .demo-table-expand .el-form-item {
    margin-right: 0;
    margin-bottom: 0;
    width: 50%;
  }
</style>

<script>
  export default {
    data() {
      return {
        search: '',
       tableData: [{
          cohortId: '',
          cohortTitle: '',
          cohortTags: '',
          cohortContent: '',
          cohortWebLink: '',
          cohortFunding: '',
          cohortKeyPublication: '',
          }],
      }
    }
  }
</script>