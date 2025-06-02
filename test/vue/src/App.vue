<template>
    <RouterView></RouterView>
</template>

<script setup>
import { onMounted } from "vue"
import { ref } from "vue"


const userInfo = ref({})

// onMounted(() => {
//     fetch(
//         "api/test/test1"
//     ).then((data) => {
//         return data.json()

//     }).then(
//         (data) => {
//             userInfo.value = data
//         }
//     )
// })
</script>
