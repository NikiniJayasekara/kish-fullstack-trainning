const mongoose = require('mongoose')

const scheduleSchema = new mongoose.Schema(
    {
      id: {
        type: Number,
        required: true,
      },
      type: {
        type: String,
        required: true,
      },
      capacity: {
        type: Number,
        required: true,
      },
      status: {
        type: String,
        required: true,
        enum: ["pending", "scheduled", "completed"],
        default: "pending",
      },
      shippingDate: {
        type: Date,
      },
    },
  )
  
  module.exports = mongoose.model('Shedule', scheduleSchema)