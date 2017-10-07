<template>
  <div class="container">
    <div class="row">
      <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
        <h1>Http</h1>
        <div class="form-group">
          <label>Username</label>
          <input class="form-control" type="text" v-model="user.name">
        </div>
        <div class="form-group">
          <label>Mail</label>
          <input class="form-control" type="text" v-model="user.mail">
        </div>
        <button class="btn btn-primary" @click="submit">Submit</button>
      </div>
    </div>
  </div>

</template>

<script>
export default {
  name: 'app',
  data () {
    return {
        user: {
            name: '',
            mail: ''
        },
    }
  },
  methods: {
      submit() {
        this.$http.post('http://localhost:8080/saveUser', this.user)
                .then(response => {
                    console.log(response);
                }, error => {
                    console.log(error);
                });
      },
  }
}
</script>

<style>

</style>
